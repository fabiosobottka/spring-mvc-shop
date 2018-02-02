package sobottka.springmvc.webstorebackend.daoimpl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public void cadastrar(E entity) throws Exception {
		
		try {
			em.persist(entity);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		
		
	}

	@Override
	public void alterar(E entity) {
		em.merge(entity);
		
	}

	@Override
	public void remover(I id) throws Exception {
		E entity = pesquisar(id);
		
		if(entity == null)
			throw new Exception("Entidade não encontrada");
		
		em.remove(entity);
	}

	@Override
	@Transactional
	public E pesquisar(I id) throws Exception {
		try {
			return em.find(clazz, id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		
	}

	@Override
	@Transactional
	public List<E> listar() {
		return em.createQuery("from " + clazz.getName(),clazz).getResultList();
		// TODO HQL para listar
	}

}
