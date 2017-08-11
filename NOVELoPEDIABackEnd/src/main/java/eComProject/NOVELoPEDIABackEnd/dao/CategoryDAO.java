package eComProject.NOVELoPEDIABackEnd.dao;


import java.util.List;

import org.springframework.stereotype.Service;

import eComProject.NOVELoPEDIABackEnd.dto.Category;



@Service
public interface CategoryDAO {

	boolean add(Category category);

	List<Category> list();

	Category get(int id);
}
