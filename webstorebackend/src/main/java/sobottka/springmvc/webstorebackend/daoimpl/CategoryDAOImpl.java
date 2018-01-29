package sobottka.springmvc.webstorebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sobottka.springmvc.webstorebackend.dao.CategoryDAO;
import sobottka.springmvc.webstorebackend.dto.Category;

/**
 * Classe de acesso ao Banco de dados
 * 
 * @author Fabio Sobottka
 */
@Repository
public class CategoryDAOImpl extends GenericDAOImpl<Category, Integer> implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is a description for television!");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is a description for mobile!");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Notebook");
		category.setDescription("This is a description for notebook!");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
	}
	
	public List<Category> listar() {
		
		return categories;
	}
	
}
