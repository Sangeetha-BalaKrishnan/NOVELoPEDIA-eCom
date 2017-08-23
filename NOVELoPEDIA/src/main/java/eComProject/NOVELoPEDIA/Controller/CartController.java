package eComProject.NOVELoPEDIA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import eComProject.NOVELoPEDIA.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	
	@RequestMapping("/show")
	public ModelAndView showCart(@RequestParam(name = "result" , required =false)String result){
		
		ModelAndView mvc = new ModelAndView("home");
		
		if(result != null){
			
			switch(result){
			
			case "updated":
				mvc.addObject("message", "CartLine has been updated Successfully");
				break;
			case "error":
				mvc.addObject("message", "Something went wrong!");
				break;
			case "deleted":
						mvc.addObject("message","CartLine has been remove sucessfully");
								break;
				
			}
		}
		
		mvc.addObject("Value","user cart");
		mvc.addObject("userClickShowCart" , true);
		mvc.addObject("cartLines" , cartService.getCartLines());
		
		return mvc;
		
	}
	@RequestMapping("/{cartLineId}/update")
	public String updateCart(@PathVariable int cartLineId, @RequestParam int count)
	{
		String response = cartService.updateCartLine(cartLineId, count);
		return "redirect:/cart/show?"+response;
	}
	
	@RequestMapping("/{cartLineId}/delete")
		public String updateCart(@PathVariable int cartLineId) {
			
			String response = cartService.deleteCartLine(cartLineId);
			
			return "redirect:/cart/show?"+response;
	}

	@RequestMapping("/add/{productId}/product")
		public String addCart(@PathVariable int productId) {
			
			String response = cartService.addCartLine(productId);
			
			return "redirect:/cart/show?"+response;
		}

}
