package eComProject.NOVELoPEDIA.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eComProject.NOVELoPEDIA.model.UserModel;
import eComProject.NOVELoPEDIABackEnd.dao.CartLineDAO;
import eComProject.NOVELoPEDIABackEnd.dao.ProductDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Cart;
import eComProject.NOVELoPEDIABackEnd.dto.CartLine;
import eComProject.NOVELoPEDIABackEnd.dto.Product;

@Service("cartService")
public class CartService {

	@Autowired
	private CartLineDAO cartLineDAO;

	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private HttpSession session;

	// returns the cart of the user
	private Cart getCart() {

		return ((UserModel) session.getAttribute("userModel")).getCart();
	}

	// returns the entire cart line
	public List<CartLine> getCartLines() {
		Cart cart = this.getCart();
		return cartLineDAO.list(cart.getId());
	}

	public String updateCartLine(int cartLineId, int count) {

		// fetch the cartLine

		CartLine cartLine = cartLineDAO.get(cartLineId);

		if (cartLine == null) {
			return "result=error";
		} else {

			Product product = cartLine.getProduct();
			double oldTotal = cartLine.getTotal();

			if (product.getQuantity() <= count) {

				count = product.getQuantity();
			}
			cartLine.setProductCount(count);
			cartLine.setBuyingPrice(product.getUnit_price());
			cartLine.setTotal(product.getUnit_price() * count);
			cartLineDAO.update(cartLine);

			Cart cart = this.getCart();
			cart.setGrandTotal(cart.getGrandTotal() - oldTotal + cartLine.getTotal());
			cartLineDAO.updateCart(cart);

			return "result=updated";
		}
	}

	public String deleteCartLine(int cartLineId) {

		// fetch the cartLine

		CartLine cartLine = cartLineDAO.get(cartLineId);

		if (cartLine == null) {
			return "result=error";
		} else {
			// update the cart
			Cart cart = this.getCart();

			cart.setGrandTotal(cart.getGrandTotal() - cartLine.getTotal());
			cart.setCartLines(cart.getCartLines() - 1);
			cartLineDAO.updateCart(cart);

			// remove the cart line

			cartLineDAO.delete(cartLine);

			return "result=deleted";
		}
	}

	public String addCartLine(int productId) {

		String response = null;

		Cart cart = this.getCart();
		
		CartLine cartLine = cartLineDAO.getByCartAndProduct(cart.getId(), productId);
		
		if(cartLine == null)
		{
			cartLine = new CartLine();
			
			//fetch the product
			Product product = productDAO.get(productId);
			
			cartLine.setCartId(cart.getId());
			cartLine.setProduct(product);
			cartLine.setBuyingPrice(product.getUnit_price());
			cartLine.setProductCount(1);
			cartLine.setTotal(product.getUnit_price());
			cartLine.setAvailable(true);
			
			cartLineDAO.add(cartLine);
			
			cart.setCartLines(cart.getCartLines() + 1);
			cart.setGrandTotal(cart.getGrandTotal() + cartLine.getTotal());
			cartLineDAO.updateCart(cart);
			response = "result=added";
		}
		
		
		return response;

	}

}
