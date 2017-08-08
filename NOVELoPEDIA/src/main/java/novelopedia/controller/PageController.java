package novelopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import novelopedia.dao.CategoryDAO;
import novelopedia.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mvc = new ModelAndView("home");
		mvc.addObject("val", "home");
		// passing the list of category
		mvc.addObject("categories", categoryDAO.list());
		mvc.addObject("userClickHome", true);
		return mvc;
	}

	@RequestMapping(value = "/About")
	public ModelAndView about() {
		ModelAndView mvc = new ModelAndView("About");
		mvc.addObject("val", "About Us");
		return mvc;
	}

	/*
	 * Methods to load the category products
	 */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mvc = new ModelAndView("home");
		mvc.addObject("val", "All Products");
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
		mvc.addObject("val", category.getName());

		// passing the list of category
		mvc.addObject("categories", categoryDAO.list());

		// passing single category object
		mvc.addObject("category", category);

		mvc.addObject("userClickCategoryProducts", true);
		return mvc;
	}

}
