package eComProject.NOVELoPEDIA.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import eComProject.NOVELoPEDIA.model.RegisterModel;
import eComProject.NOVELoPEDIABackEnd.daoImpl.UserDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Address;
import eComProject.NOVELoPEDIABackEnd.dto.Cart;
import eComProject.NOVELoPEDIABackEnd.dto.User;

@Component
public class RegisterHandler {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public RegisterModel init() {

		return new RegisterModel();
	}

	public void addUser(RegisterModel registerModel, User user) {
		registerModel.setUser(user);
	}

	public void addBilling(RegisterModel registerModel, Address billing) {
		registerModel.setBilling(billing);
	}

	public String validateUser(User user, MessageContext er) {

		String transitionValue = "success";

		// if password matches the password
		if (!(user.getPassword().equals(user.getConfirmPassword()))) {

			er.addMessage(new MessageBuilder().error().source("confirmPassword")
					.defaultText("Password does not match the confirm password").build());

			transitionValue = "failure";

		}

		// check the uniquness of the email
		if (userDAO.getByEmail(user.getEmail()) != null) {

			er.addMessage(
					new MessageBuilder().error().source("email").defaultText("Email address is already used!").build());

			transitionValue = "failure";

		}
		return transitionValue;
	}

	public String saveAll(RegisterModel model) {

		String transitionValue = "success";

		// fetch the user
		User user = model.getUser();

		if (user.getRole().equals("USER")) {

			Cart cart = new Cart();
			cart.setUser(user);
			user.setCart(cart);

		}

		// encode the password
		String value = passwordEncoder.encode(user.getPassword());
		user.setPassword(value);

		// Save the user

		userDAO.addUser(user);

		// Get the Address
		Address billing = model.getBilling();
		billing.setUserId(user.getId());
		billing.setBilling(true);

		// save the address
		userDAO.addAddress(billing);

		return transitionValue;
	}

}
