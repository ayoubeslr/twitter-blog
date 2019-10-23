package dao;

import java.util.List;

import javax.persistence.EntityManager;

import dto.Post;
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
	
	public List<Utilisateur> get() {
		return entityManager.createQuery("select u from Utilisateur u", Utilisateur.class)
				            .getResultList();	
	}

}
