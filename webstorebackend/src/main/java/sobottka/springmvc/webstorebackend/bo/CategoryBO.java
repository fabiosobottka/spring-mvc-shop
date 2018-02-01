package sobottka.springmvc.webstorebackend.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sobottka.springmvc.webstorebackend.dao.CategoryDAO;
import sobottka.springmvc.webstorebackend.dto.Category;

/**
 * Classe que contem as regras de negócio de categoria
 * 
 * @author Fabio Sobottka
 * 
 * */
@Service
public class CategoryBO {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	public List<Category> listar() {
		
		return categoryDAO.listar();
	}
	
	public Category get(int id) {
		
		return categoryDAO.get(id);
	}

}
