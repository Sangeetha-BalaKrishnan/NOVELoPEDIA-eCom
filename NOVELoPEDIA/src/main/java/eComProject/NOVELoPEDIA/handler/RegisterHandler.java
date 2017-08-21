package eComProject.NOVELoPEDIA.handler;

import org.springframework.stereotype.Component;

import eComProject.NOVELoPEDIA.model.RegisterModel;
import eComProject.NOVELoPEDIABackEnd.dto.Address;
import eComProject.NOVELoPEDIABackEnd.dto.User;

@Component
public class RegisterHandler {

	public RegisterModel init(){
		
		return new RegisterModel();
	}
	
	
	public void addUser(RegisterModel registerModel , User user){
		registerModel.setUser(user);
	}

	public void addBilling(RegisterModel registerModel , Address billing){
		registerModel.setBilling(billing);
	}
}
