package sobottka.springmvc.webstorebackend.dao;

import java.util.List;

public interface GenericDAO<E, I>  {
	
	void cadastrar(E entity);
	void alterar(E entity);
	void remover(I id) throws Exception;
	E pesquisar(I id);
	List<E> listar();

}
