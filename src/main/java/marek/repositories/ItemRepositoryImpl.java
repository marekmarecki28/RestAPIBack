package marek.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import marek.model.Item;

public class ItemRepositoryImpl implements ItemRepositoryCustom {

	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public List<Item> findAll(Long id) {
		Query query = entityManager.createNativeQuery("SELECT * FROM item " +
                "WHERE list_id LIKE ?", Item.class);
		
		 query.setParameter(1,  id);
		 
		return query.getResultList();
	}
}
