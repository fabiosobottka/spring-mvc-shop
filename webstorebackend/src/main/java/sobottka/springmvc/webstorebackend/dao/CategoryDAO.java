package sobottka.springmvc.webstorebackend.dao;

import sobottka.springmvc.webstorebackend.dto.Category;

public interface CategoryDAO extends GenericDAO<Category, Integer>  {
	
	Category get(int id);
	
}
