package novelopedia.daoImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import novelopedia.dao.CategoryDAO;
import novelopedia.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static{
		Category category = new Category();
		//Adding category
		category.setId(1);
		category.setName("Tv");
		category.setDescription("This is some discription");
		category.setImageURL("cat.png");
		
		categories.add(category);
		
		// 2
		
		category = new Category();
		//Adding category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some discription");
		category.setImageURL("cat2.png");
		
		categories.add(category);
		
		//3
		
		category = new Category();
		//Adding category
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
		
		//Ehanced For loop
		for(Category cat:categories)
		{
			if(cat.getId() == id)
				return cat;
		}
		return null;
	}

}
