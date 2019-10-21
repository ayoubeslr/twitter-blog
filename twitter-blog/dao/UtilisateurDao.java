package dao;

import javax.persistence.EntityManager;

import dto.Utilisateur;


public class UtilisateurDao {
	
private EntityManager entityManager;
	
	public UtilisateurDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	public void creer(Utilisateur e){
		entityManager.getTransaction().begin();

		entityManager.persist(e);
		entityManager.getTransaction().commit();
		
	}

}
