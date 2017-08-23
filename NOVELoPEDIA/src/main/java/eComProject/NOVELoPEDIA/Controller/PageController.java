package eComProject.NOVELoPEDIA.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import eComProject.NOVELoPEDIA.exception.ProductNotFoundException;
import eComProject.NOVELoPEDIABackEnd.dao.CategoryDAO;
import eComProject.NOVELoPEDIABackEnd.dao.ProductDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Category;
import eComProject.NOVELoPEDIABackEnd.dto.Product;

@Controller
public class PageController {

	private static final Logger logger = LoggerFactory.getLogger(PageController.class);
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mvc = new ModelAndView("home");
		mvc.addObject("Value","home");
	
		logger.info("Inside PageController index method-INFO");
		logger.debug("Inside PageController index method-DEBUG");
	
		// passing the list of category
		mvc.addObject("categories", categoryDAO.list());
		mvc.addObject("userClickHome", true);
		return mvc;
	}

	@RequestMapping(value = "/About")
	public ModelAndView about() {
		ModelAndView mvc = new ModelAndView("home");
		mvc.addObject("Value","About Us");
		mvc.addObject("userClickAbout", true);
		return mvc;
	}

	@RequestMapping(value = "/checkout")
	public ModelAndView checkOut() {
		ModelAndView mvc = new ModelAndView("checkout");
		return mvc;
	}
	/*
	 * Methods to load the category products
	 */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mvc = new ModelAndView("home");
		mvc.addObject("Value","All Products");
		// passing the list of category
		mvc.addObject("categories", categoryDAO.list());
		mvc.addObject("userClickAllProducts", true);
		return mvc;
	}

	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mvc = new ModelAndView("home");

		// categrdoryDAO to fetch a single category
		Category category = null;
		category = categoryDAO.get(id);
		mvc.addObject("Value",category.getName());

		// passing the list of category
		mvc.addObject("categories", categoryDAO.list());

		// passing single category object
		mvc.addObject("category", category);

		mvc.addObject("userClickCategoryProducts", true);
		return mvc;
	}

	//Viewing Single Product
	
	@RequestMapping(value="/show/{id}/product")
	public ModelAndView showSingleProduct(@PathVariable int id)throws ProductNotFoundException
	{
		ModelAndView mvc = new ModelAndView("home");
		
		Product product = productDAO.get(id);
		
		if(product == null) throw new ProductNotFoundException();
		//Update view Count
		product.setViews(product.getViews()+1);
		productDAO.update(product);
		
		mvc.addObject("Value",product.getName());
		mvc.addObject("product",product);
		mvc.addObject("userClickShowProduct",true);
		
		return mvc;
	}
	
/*Having similar mapping*/
	@RequestMapping(value = "/register")
	public ModelAndView register() {
		ModelAndView mvc = new ModelAndView("home");
		mvc.addObject("Value","About Us");
		return mvc;
	}

	/*Login*/
	@RequestMapping(value = "/login")
	public ModelAndView login(@RequestParam(name="error", required=false)String error ,@RequestParam(name="logout", required=false)String logout) {
		ModelAndView mvc = new ModelAndView("login");
		
		if(error!=null){
			mvc.addObject("message" , "Invalid Username and Password");
		}
		
		
		if(logout!=null){
			mvc.addObject("logout" , "Logged Out !");
		}
		
		mvc.addObject("Value","Login");
		return mvc;
	}
	
	@RequestMapping(value = "/access-denied")
	public ModelAndView accessDenied() {
		ModelAndView mvc = new ModelAndView("error");
		mvc.addObject("Title","403 - Access Denied");
		mvc.addObject("errorTitle"," Access Denied");
		mvc.addObject("errorDescription","Not authorized to view this page");
		return mvc;
	}
	
	//Logout
	@RequestMapping(value = "/perform-logout")
	public String logout(HttpServletRequest request, HttpServletResponse response)
	{
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if(auth!=null){
			
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		
		return "redirect:/login?logout";
	}
	
	
	
	
}
