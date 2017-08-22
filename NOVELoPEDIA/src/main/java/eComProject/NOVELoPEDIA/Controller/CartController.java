package eComProject.NOVELoPEDIA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import eComProject.NOVELoPEDIA.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	
	@RequestMapping("/show")
	public ModelAndView showCart(){
		
		ModelAndView mvc = new ModelAndView("home");
		
		mvc.addObject("Value","user cart");
		mvc.addObject("userClickShowCart" , true);
		mvc.addObject("cartLines" , null);
		
		return mvc;
		
	}
}
