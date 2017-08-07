package novelopedia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
@RequestMapping(value = {"/","/home","/index"})
public ModelAndView index()
{ 
	ModelAndView mvc = new ModelAndView("home");
	 mvc.addObject("val","home");
	return mvc;
}
@RequestMapping(value = "/About")
public ModelAndView about()
{ 
	ModelAndView mvc = new ModelAndView("About");
	mvc.addObject("val","About Us");
	return mvc;
}
}
