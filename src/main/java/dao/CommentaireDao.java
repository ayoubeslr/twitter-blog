package dao;

import javax.persistence.EntityManager;

import dto.Commentaire;


public class CommentaireDao {
	
private EntityManager entityManager;
	
	public CommentaireDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	public void creer(Commentaire e){
		entityManager.getTransaction().begin();

		entityManager.persist(e);
		entityManager.getTransaction().commit();
		
	}

}
