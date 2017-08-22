package eComProject.NOVELoPEDIABackEnd.daoImpl;

import java.util.List;

import eComProject.NOVELoPEDIABackEnd.dto.Address;
import eComProject.NOVELoPEDIABackEnd.dto.Cart;
import eComProject.NOVELoPEDIABackEnd.dto.User;

public interface UserDAO {
	
	//Add an User
	boolean addUser(User user);
	User getByEmail(String email);
	
	//Add an address
	boolean addAddress(Address address);
	Address getBillingAddress(User user);
	List<Address> listShippingAddress(User user);
	
	
}
