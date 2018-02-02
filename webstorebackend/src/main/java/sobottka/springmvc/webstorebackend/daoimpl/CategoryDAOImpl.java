package sobottka.springmvc.webstorebackend.daoimpl;

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
	
	
}
