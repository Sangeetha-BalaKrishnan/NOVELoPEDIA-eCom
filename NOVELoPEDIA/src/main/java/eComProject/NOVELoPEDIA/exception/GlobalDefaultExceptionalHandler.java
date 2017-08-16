package eComProject.NOVELoPEDIA.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionalHandler {

	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException(){
		
		ModelAndView mvc = new ModelAndView("error");
		
		mvc.addObject("errorTitle","The Page is not Constructed");
		mvc.addObject("errorDescription","The Page You are looking for is not available now!");
		mvc.addObject("Title","404 Error Page");
	
		return mvc;
	}

	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException(){
		
		ModelAndView mvc = new ModelAndView("error");
		
		mvc.addObject("errorTitle","Product Not Available");
		mvc.addObject("errorDescription","The product looking for is not available right now !");
		mvc.addObject("Title","Product Unavilable");
	
		return mvc;
	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex){
		
		ModelAndView mvc = new ModelAndView("error");
		
		mvc.addObject("errorTitle","Contact Your Administrator!");
		
		/*Only for debuging */
		/*StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		ex.printStackTrace(pw);
		*/
		mvc.addObject("errorDescription",ex.toString());
		mvc.addObject("Title","Error");
	
		return mvc;
	}

}
