package eComProject.NOVELoPEDIABackEnd.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eComProject.NOVELoPEDIABackEnd.dao.CategoryDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	public SessionFactory sessionFactory;

	@Autowired
	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		// Adding category
		category.setId(1);
		category.setName("Tv");
		category.setDescription("This is some discription");
		category.setImageURL("cat.png");

		categories.add(category);

		// 2

		category = new Category();
		// Adding category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some discription");
		category.setImageURL("cat2.png");

		categories.add(category);

		// 3

		category = new Category();
		// Adding category
		category.setId(3);
		category.setName("lap");
		category.setDescription("This is some discription");
		category.setImageURL("cat3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {

		return categories;
	}

	@Override
	public Category get(int id) {

		// Enhanced For loop
		for (Category cat : categories) {
			if (cat.getId() == id)
				return cat;
		}
		return null;
	}

	@Override
	@Transactional
	public boolean add(Category category) {

		try {
			// Add the categor to the database
			sessionFactory.getCurrentSession().persist(category);

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;

		}

	}
	

}
