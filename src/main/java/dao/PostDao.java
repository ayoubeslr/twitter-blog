package dao;

import javax.persistence.EntityManager;

import dto.Post;


public class PostDao {
	
private EntityManager entityManager;
	
	public PostDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	public void creer(Post e){
		entityManager.getTransaction().begin();

		entityManager.persist(e);
		entityManager.getTransaction().commit();
		
	}

}
