package novelopedia.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import novelopedia.dao.CategoryDAO;
import novelopedia.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	
	private static CategoryDAO categoryDAO;
	
	
	private  Category category;
	
	
	
	@BeforeClass
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("novelopedia");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	
	@Test
	public void testAddCategory(){
		
		category = new Category();
		
		category.setName("Telev");
		category.setDescription("This is some discription");
		category.setImageURL("cat_1.png");
		
		assertEquals("Added Category",true,categoryDAO.add(category));
		

	}
}
