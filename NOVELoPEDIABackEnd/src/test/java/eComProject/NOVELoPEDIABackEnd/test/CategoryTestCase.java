package eComProject.NOVELoPEDIABackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eComProject.NOVELoPEDIABackEnd.dao.CategoryDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("eComProject.NOVELoPEDIABackEnd");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory() {
	 * 
	 * category = new Category();
	 * 
	 * category.setName("Romance");
	 * category.setDescription("The Romance Genre");
	 * category.setImageURL("Romance1.png");
	 * 
	 * assertEquals("Added Category", true, categoryDAO.add(category));
	 * 
	 * }
	 */
	/*
	 * @Test public void testGetCategory(){
	 * 
	 * category = categoryDAO.get(3);
	 * assertEquals("Successfully Fetched a Single Category from the table",
	 * "Fiction", category.getName());
	 * 
	 * }
	 */
	/*
	 * @Test public void testUpdateCategory(){
	 * 
	 * category = categoryDAO.get(3); category.setName("FIc");
	 * assertEquals("Successfully Updated a Single Category from the table",
	 * true, categoryDAO.update(category));
	 * 
	 * }
	 */
	/*
	 * @Test public void testDeleteCategory(){
	 * 
	 * category = categoryDAO.get(4);
	 * assertEquals("Successfully deleted a Single Category from the table",
	 * true, categoryDAO.delete(category));
	 * 
	 * }
	 */
	/*
	 * @Test public void testListCategory(){
	 * 
	 * assertEquals("Successfully fetched List of Categories from the table", 3,
	 * categoryDAO.list().size());
	 * 
	 * }
	 */

	@Test
	public void testCRUDCategory() {

		// addOperation
		category = new Category();

		category.setName("Romance");
		category.setDescription("The Romance Genre");
		category.setImageURL("Romance1.png");
		assertEquals("Added Category", true, categoryDAO.add(category));
		
		
		category = new Category();

		category.setName("Fiction");
		category.setDescription("The Fiction Genre");
		category.setImageURL("Fiction1.png");
		assertEquals("Added Category", true, categoryDAO.add(category));

		// fetching and Updating
		category = categoryDAO.get(2);
		category.setName("Fic");
		assertEquals("Successfully Updated a Single Category from the table", true, categoryDAO.update(category));

		// fetching and deleting the category
		assertEquals("Successfully deleted a Single Category from the table", true, categoryDAO.delete(category));

		// fetching a list
		assertEquals("Successfully fetched List of Categories from the table", 1, categoryDAO.list().size());

	}

}
