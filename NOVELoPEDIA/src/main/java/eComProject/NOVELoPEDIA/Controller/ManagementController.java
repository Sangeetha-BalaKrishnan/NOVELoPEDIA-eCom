package eComProject.NOVELoPEDIA.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import eComProject.NOVELoPEDIA.util.fileUploadUtility;
import eComProject.NOVELoPEDIABackEnd.dao.CategoryDAO;
import eComProject.NOVELoPEDIABackEnd.dao.ProductDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Category;
import eComProject.NOVELoPEDIABackEnd.dto.Product;

@Controller
@RequestMapping("/manage")
public class ManagementController {

	@Autowired
	private CategoryDAO categoryDAO;

	@Autowired
	private ProductDAO produtDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView showManageProducts(@RequestParam(name="operation", required = false) String operation) {

		ModelAndView mvc = new ModelAndView("home");

		mvc.addObject("userClickManageProducts", true);
		mvc.addObject("Value", "Manage Products");

		Product nProduct = new Product();

		// set Few of the fields
		nProduct.setSupplierId(1);
		nProduct.setActive(true);

		mvc.addObject("product", nProduct);

		if(operation!= null){
			
			if(operation.equals("product")){
				
				mvc.addObject("message","Product Submitted");
			}
		}
		return mvc;
	}
	
	@RequestMapping(value="/products" , method = RequestMethod.POST)
	public String handleProductsubmission(@Valid @ModelAttribute("product") Product mProduct, BindingResult results, Model model , HttpServletRequest request){
		
		//Check if there are any errors
		
		if(results.hasErrors()){
			
			model.addAttribute("userClickManageProducts", true);
			model.addAttribute("Value", "Manage Products");
			model.addAttribute("message", "Validation Failed For Product Submission!");
			return "home";
		}
		
		logger.info(mProduct.toString());
		
		//create new product record
		produtDAO.add(mProduct);
		
		
		if(!mProduct.getFile().getOriginalFilename().equals("")){
			fileUploadUtility.uploadFile(request, mProduct.getFile(), mProduct.getCode());
			
		}
		
		return "redirect:/manage/products?operation=product";
	}

	// Returning Categories
	@ModelAttribute("categories")
	public List<Category> getCategories() {

		return categoryDAO.list();
	}

	// Product Submission




}
