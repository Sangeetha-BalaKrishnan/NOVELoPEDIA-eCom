package eComProject.NOVELoPEDIA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import eComProject.NOVELoPEDIABackEnd.dao.CategoryDAO;
import eComProject.NOVELoPEDIABackEnd.dao.ProductDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Category;
import eComProject.NOVELoPEDIABackEnd.dto.Product;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mvc = new ModelAndView("home");
		mvc.addObject("Value","home");
		// passing the list of category
		mvc.addObject("categories", categoryDAO.list());
		mvc.addObject("userClickHome", true);
		return mvc;
	}

	@RequestMapping(value = "/About")
	public ModelAndView about() {
		ModelAndView mvc = new ModelAndView("About");
		mvc.addObject("Value","About Us");
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
	public ModelAndView showSingleProduct(@PathVariable int id)
	{
		ModelAndView mvc = new ModelAndView("home");
		
		Product product = productDAO.get(id);
		
		//Update view Count
		product.setViews(product.getViews()+1);
		productDAO.update(product);
		
		mvc.addObject("Value",product.getName());
		mvc.addObject("product",product);
		mvc.addObject("userClickShowProduct",true);
		
		return mvc;
	}
	
	
	
}
