package eComProject.NOVELoPEDIABackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eComProject.NOVELoPEDIABackEnd.dao.ProductDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("eComProject.NOVELoPEDIABackEnd");
		context.refresh();

		productDAO = (ProductDAO) context.getBean("productDAO");
	}
/*
	@Test
	public void testCRUDProduct() {

		// Create operation

		product = new Product();

		product.setName("The Hunger Games: Catching Fire");
		product.setAuthor("Suzanne Collins");
		product.setDescription(
				"Katniss is advised by President Snow to participate in a special edition of the Hunger Games that will feature all its previous winners in order to eliminate her, due to her influential nature");
		product.setUnit_price(1165);
		product.setActive(true);
		product.setCategoryId(2);
		product.setSupplierId(2);

		assertEquals("Something went wrong while inserting a new Product!", true, productDAO.add(product));

		// Fetching And Updating
		product = productDAO.get(2);
		product.setName("Harry Potter and the Order of Phenoix");
		assertEquals("Something went wrong while Updating the existing Product!", true,
				productDAO.update(product));

		// fetching and deleting the category
		assertEquals("Something went wrong while deleting the existing Product!", true, productDAO.delete(product));

		// fetching a list
		assertEquals("Something went wrong while fetching the  List of Products from the table", 6, productDAO.list().size());

	}
*/
	@Test
	public void testListActiveProducts(){
		assertEquals("Something went wrong while fetching the  List of active Products from the table", 5, productDAO.listActiveProducts().size());
	}

	@Test
	public void testListActiveProductsByCategory(){
		assertEquals("Something went wrong while fetching the  List of active Products by categoryID from the table", 2, productDAO.listActiveProductsByCategory(1).size());
		assertEquals("Something went wrong while fetching the  List of active Products by categoryID from the table", 1, productDAO.listActiveProductsByCategory(2).size());
		assertEquals("Something went wrong while fetching the  List of active Products by categoryID  from the table", 1, productDAO.listActiveProductsByCategory(3).size());
		assertEquals("Something went wrong while fetching the  List of active Products by categoryID from the table", 1, productDAO.listActiveProductsByCategory(4).size());
	}
	@Test
	public void testLatestActiveProduct(){
		assertEquals("Something went wrong while fetching the  List of latest active products from the table", 5, productDAO.getLatestActiveProducts(5).size());
	}



}
