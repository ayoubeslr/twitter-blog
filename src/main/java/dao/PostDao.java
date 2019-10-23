package dao;

import java.util.List;

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
	
	public List<Post> get() {
		return entityManager.createQuery("select p from Post p", Post.class)
				            .getResultList();	
	}

}
