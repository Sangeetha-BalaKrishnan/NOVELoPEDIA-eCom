package eComProject.NOVELoPEDIABackEnd.daoImpl;

import eComProject.NOVELoPEDIABackEnd.dto.Address;
import eComProject.NOVELoPEDIABackEnd.dto.Cart;
import eComProject.NOVELoPEDIABackEnd.dto.User;

public interface UserDAO {
	
	//Add an User
	boolean addUser(User user);
	
	//Add an address
	boolean addAddress(Address address);
	
	//Add a Cart
	boolean addCart(Cart cart);

}
