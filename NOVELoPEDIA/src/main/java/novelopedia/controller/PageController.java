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
	 mvc.addObject("Greetings","Welcome To spring in Web MVC");
	return mvc;
}
/*@RequestMapping(value="/test")
public ModelAndView test(@RequestParam(value="Greetings", required=false)String g)
{	if(g == null)
{
	g = "hello there";
}
	ModelAndView mvc = new ModelAndView("home");
	 mvc.addObject("Greetings",g);
	return mvc;

	
}

@RequestMapping(value="/test/{Greetings}")
public ModelAndView test(@PathVariable("Greetings")String glu)
{	if(glu == null)
{
	glu = "hello there";
}
	ModelAndView mvc = new ModelAndView("home");
	 mvc.addObject("Greetings",glu);
	return mvc;

	
}*/

}
