package sobottka.springmvc.webstorebackend.daoimpl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sobottka.springmvc.webstorebackend.dao.GenericDAO;

public class GenericDAOImpl<E, I> implements GenericDAO<E, I> {
	
	@PersistenceContext
	protected EntityManager em;
	
	private Class<E> clazz;
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		clazz = (Class<E>) ((ParameterizedType)getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void cadastrar(E entity) {
		em.persist(entity);
		// TODO HQL para cadastrar
	}

	@Override
	public void alterar(E entity) {
		em.merge(entity);
		// TODO HQL para alterar
	}

	@Override
	public void remover(I id) throws Exception {
		E entity = pesquisar(id);
		
		if(entity == null)
			throw new Exception("Entidade não encontrada");
		
		em.remove(entity);
	}

	@Override
	public E pesquisar(I id) {
		return em.find(clazz, id);
		// TODO HQL para pesquisar
	}

	@Override
	public List<E> listar() {
		System.out.println("Fabioooo3");
		return em.createQuery("from" + clazz.getName(),clazz).getResultList();
		// TODO HQL para listar
	}

}
