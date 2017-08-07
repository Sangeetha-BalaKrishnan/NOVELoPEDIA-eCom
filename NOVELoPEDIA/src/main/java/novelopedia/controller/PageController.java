package novelopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import novelopedia.dao.CategoryDAO;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO CategoryDAO;
@RequestMapping(value = {"/","/home","/index"})
public ModelAndView index()
{ 
	ModelAndView mvc = new ModelAndView("home");
	 mvc.addObject("val","home");
	 
	 //passing the list of category
	 mvc.addObject("categories",CategoryDAO.list());
	return mvc;
}
@RequestMapping(value = "/About")
public ModelAndView about()
{ 
	ModelAndView mvc = new ModelAndView("About");
	mvc.addObject("val","About Us");
	return mvc;
}
@RequestMapping(value = "/")
public ModelAndView product()
{ 
	ModelAndView mvc = new ModelAndView("home");
	mvc.addObject("val","Product");
	return mvc;
}

}
