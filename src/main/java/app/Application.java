package app;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.CommentaireDao;
import dao.PostDao;
import dao.UtilisateurDao;
import dto.Commentaire;
import dto.Post;
import dto.Utilisateur;



public class Application {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("twitter-blog");
		try {
			EntityManager em = emf.createEntityManager();
			try {
				UtilisateurDao utilisateurDao = new UtilisateurDao(em);
				PostDao postDao = new PostDao(em);
				CommentaireDao commentaireDao = new CommentaireDao(em);
				Utilisateur user1 = new Utilisateur("Quinsac", "Leo","quinsacleo@gmail.com","azerty456");
				Post post = new Post("mon premier post", new Date(), 3, user1, null);
				Commentaire commentaire = new Commentaire("mon premier message", user1, post);
				
				
				//utilisateurDao.creer(user1);


				
			}
			finally {
				em.close();
			}
		} finally {
			emf.close();
		}
	}

}
