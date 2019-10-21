package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.UtilisateurDao;
import dto.Utilisateur;



public class Application {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("twitter");
		try {
			EntityManager em = emf.createEntityManager();
			try {
				UtilisateurDao utilisateurDao = new UtilisateurDao(em);
				Utilisateur user1 = new Utilisateur("Quinsac", "Leo","quinsacleo@gmail.com","azerty456");

				utilisateurDao.creer(user1);


				
			}
			finally {
				em.close();
			}
		} finally {
			emf.close();
		}
	}

}
