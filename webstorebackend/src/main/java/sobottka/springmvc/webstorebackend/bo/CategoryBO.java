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
	
	
	public List<Category> listar() throws Exception {
		
		try {
			return categoryDAO.listar();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Erro ao listar as categorias do banco de dados!");
		}
	}
	
	public void cadastrar(Category category) throws Exception {
		try {
			categoryDAO.cadastrar(category);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Erro ao cadastrar categoria!");
		}
	}
	
	public Category pesquisar(int id) throws Exception {
		
		try {
			return categoryDAO.pesquisar(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Erro ao pesquisar categoria");
		}
	}

}
