package eComProject.NOVELoPEDIA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public ModelAndView showManageProducts(){
		
		ModelAndView mvc = new ModelAndView("home");
		
		mvc.addObject("userClickManageProducts", true);
		mvc.addObject("Value","Manage Products");
	
		return mvc;
		
		
	}

}
