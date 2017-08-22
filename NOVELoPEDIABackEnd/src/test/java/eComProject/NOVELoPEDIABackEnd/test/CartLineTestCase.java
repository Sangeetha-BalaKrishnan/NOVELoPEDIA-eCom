package eComProject.NOVELoPEDIABackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eComProject.NOVELoPEDIABackEnd.dao.CartLineDAO;
import eComProject.NOVELoPEDIABackEnd.dao.ProductDAO;
import eComProject.NOVELoPEDIABackEnd.daoImpl.UserDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Cart;
import eComProject.NOVELoPEDIABackEnd.dto.CartLine;
import eComProject.NOVELoPEDIABackEnd.dto.Product;
import eComProject.NOVELoPEDIABackEnd.dto.User;

public class CartLineTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CartLineDAO cartLineDAO = null;
	private static ProductDAO productDAO = null;
	private static UserDAO userDAO = null;
	
	
	private User user = null;
	private Cart cart = null;
	private Product product = null;
	private CartLine cartLine = null;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("eComProject.NOVELoPEDIABackEnd");
		context.refresh();

		userDAO = (UserDAO) context.getBean("userDAO");
		productDAO = (ProductDAO) context.getBean("productDAO");
		cartLineDAO = (CartLineDAO) context.getBean("cartLineDAO");
	}


	@Test
	public void testAdd(){
		
		//get the user
		user = userDAO.getByEmail("anu@gmail.com");
		
		//fetch the cart
		cart = user.getCart();
		
		//3 get the product
		product = productDAO.get(1);
		
		//create a new cartline
		cartLine = new CartLine();
		cartLine.setBuyingPrice(product.getUnit_price());
		
		cartLine.setProductCount(cartLine.getProductCount()+1);
		
		cartLine.setTotal(cartLine.getProductCount()*product.getUnit_price());
		
		cartLine.setAvailable(true);
		cartLine.setCartId(cart.getId());
		cartLine.setProduct(product);
		
		 assertEquals("Failed to add cart!",true,cartLineDAO.add(cartLine));
		
		 cart.setGrandTotal(cart.getGrandTotal()+cartLine.getTotal());
		 cart.setCartLines(cart.getCartLines()+1);
		 
		 assertEquals("Failed to update thecart!",true,cartLineDAO.updateCart(cart));
	}
}
