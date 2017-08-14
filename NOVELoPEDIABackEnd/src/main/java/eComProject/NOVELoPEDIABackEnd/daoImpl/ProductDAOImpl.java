package eComProject.NOVELoPEDIABackEnd.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eComProject.NOVELoPEDIABackEnd.dao.ProductDAO;
import eComProject.NOVELoPEDIABackEnd.dto.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	public SessionFactory sessionFactory;

	// Single Product
	@Override
	public Product get(int productId) {
		try {
			return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(productId));
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	// List of products
	@Override
	public List<Product> list() {

		return sessionFactory.getCurrentSession().createQuery("FROM  Product", Product.class).getResultList();
	}

	// Insert product
	@Override
	public boolean add(Product product) {
		try {
			sessionFactory.getCurrentSession().persist(product);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	// Update Product
	@Override
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean delete(Product product) {

		try {
			product.setActive(false);
			return this.update(product);
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Product> listActiveProducts() {

		return null;
	}

	@Override
	public List<Product> listActiveProductsByCategory(int categoryId) {

		return null;
	}

	@Override
	public List<Product> getLatestActiveProducts(int count) {

		return null;
	}

}
