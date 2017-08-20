package eComProject.NOVELoPEDIABackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eComProject.NOVELoPEDIABackEnd.daoImpl.UserDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Address;
import eComProject.NOVELoPEDIABackEnd.dto.Cart;
import eComProject.NOVELoPEDIABackEnd.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	private Cart cart = null;
	private Address address = null;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("eComProject.NOVELoPEDIABackEnd");
		context.refresh();
		
		userDAO =(UserDAO) context.getBean("userDAO");
	}
	
	@Test
	public void testAdd(){
		
		user = new User();
		user.setFirstName("Aisha");
		user.setLastName("Malhothra");
		user.setEmail("aishamalhothra.90@gmail.com");
		user.setContactNumber("9632587410");
		user.setRole("USER");
		user.setPassword("123456");
		
		//Add the user
		assertEquals("Failed to add user!",true,userDAO.addUser(user));
		
		address = new Address();
		address.setAddressLineOne("10/B Ragams raag durbar,Venkateshan Nagar");
		address.setAddressLineTwo("Near old meena House");
		address.setCity("Chennai");
		address.setState("Tamil Nadu");
		address.setCountry("India");
		address.setPostalCode("600092");
		address.setBilling(true);
		
		//Link the user with the address using userId
		address.setUserId(user.getId());
		
		//Add the Address
		assertEquals("Failed to address!",true,userDAO.addAddress(address));
		
		if(user.getRole().equals("USER")){
			
			//Create  a cart
			cart = new Cart();
			cart.setUserId(user.getId());
			
			//Add a cart
			assertEquals("Failed to add cart!",true,userDAO.addCart(cart));
			
			
			//add a shipping address for this user
			address = new Address();
			address.setAddressLineOne("10a, raajan street,near pondicherry beach house");
			address.setAddressLineTwo("nungambakkam");
			address.setCity("Chennai");
			address.setState("Tamil Nadu");
			address.setCountry("India");
			address.setPostalCode("600092");
			address.setShipping(true);
			
			
			//Link it with the user
			address.setUserId(user.getId());
			
			//add the shipping address
			assertEquals("Failed to add Shipping address!",true,userDAO.addAddress(address));
			
		}
	
		
	}

		
}
