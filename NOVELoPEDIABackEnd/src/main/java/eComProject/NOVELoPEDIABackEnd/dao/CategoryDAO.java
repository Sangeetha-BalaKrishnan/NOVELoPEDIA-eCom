package eComProject.NOVELoPEDIABackEnd.dao;


import java.util.List;

import eComProject.NOVELoPEDIABackEnd.dto.Category;



public interface CategoryDAO {

	boolean add(Category category);

	List<Category> list();

	Category get(int id);
}
