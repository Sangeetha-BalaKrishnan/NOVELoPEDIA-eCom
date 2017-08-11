package novelopedia.dao;

import java.util.List;

import novelopedia.dto.Category;


public interface CategoryDAO {

	boolean add(Category category);

	List<Category> list();

	Category get(int id);
}
