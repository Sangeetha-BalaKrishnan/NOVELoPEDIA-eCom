package eComProject.NOVELoPEDIABackEnd.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eComProject.NOVELoPEDIABackEnd.daoImpl.UserDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Address;
import eComProject.NOVELoPEDIABackEnd.dto.Cart;
import eComProject.NOVELoPEDIABackEnd.dto.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public boolean addUser(User user) {
		
		try{
			sessionFactory.getCurrentSession().persist(user);
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean addAddress(Address address) {
		
		try{
			sessionFactory.getCurrentSession().persist(address);
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean addCart(Cart cart) {
	
		try{
			sessionFactory.getCurrentSession().persist(cart);
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
	}
	

}
