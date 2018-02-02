package sobottka.springmvc.webstorebackend.dao;

import java.util.List;

public interface GenericDAO<E, I>  {
	
	void cadastrar(E entity) throws Exception;
	void alterar(E entity) throws Exception;
	void remover(I id) throws Exception;
	E pesquisar(I id) throws Exception;
	List<E> listar() throws Exception;

}
