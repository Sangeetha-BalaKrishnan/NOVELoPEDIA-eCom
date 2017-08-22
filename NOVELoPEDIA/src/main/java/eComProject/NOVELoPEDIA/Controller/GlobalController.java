package eComProject.NOVELoPEDIA.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import eComProject.NOVELoPEDIA.model.UserModel;
import eComProject.NOVELoPEDIABackEnd.daoImpl.UserDAO;
import eComProject.NOVELoPEDIABackEnd.dto.User;

@ControllerAdvice
public class GlobalController {

	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private UserDAO userDAO;
	
	private UserModel userModel=null;
	
	@ModelAttribute("userModel")
	public UserModel getUserModel(){
		
		if(session.getAttribute("userModel") ==null){
			
			//Add the user Model
			Authentication authentication =SecurityContextHolder.getContext().getAuthentication();
			
			User user =userDAO.getByEmail(authentication.getName());
			if(user!=null){
				
				//Create a new user model to pass user details
				userModel = new UserModel();
				
				userModel.setId(user.getId());
				userModel.setEmail(user.getEmail());
				userModel.setRole(user.getRole());
				userModel.setFullName(user.getFirstName()+" "+user.getLastName());
				
				if(userModel.getRole().equals("USER"))
				{
					//set the cart only for the buyer
					userModel.setCart(user.getCart());
					
				}
				//set the usermodel in the session
				session.setAttribute("userModel", userModel);
				
				return userModel;
			}
		}
		
		
		return (UserModel) session.getAttribute("userModel");
	}
}
