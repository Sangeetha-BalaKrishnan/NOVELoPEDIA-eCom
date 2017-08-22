package eComProject.NOVELoPEDIA.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eComProject.NOVELoPEDIA.model.UserModel;
import eComProject.NOVELoPEDIABackEnd.dao.CartLineDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Cart;
import eComProject.NOVELoPEDIABackEnd.dto.CartLine;

@Service("cartService")
public class CartService {

	@Autowired
	private CartLineDAO cartLineDAO;
	
	@Autowired
	private HttpSession session;
	
	//returns the cart of the user 
	private Cart getCart(){
		
		return ((UserModel)session.getAttribute("userModel")).getCart();
	}
	
	//returns the entire cart line
	public List<CartLine> getCartLines(){
		Cart cart = this.getCart();
		return  cartLineDAO.list(cart.getId());
	}
	
	

}
