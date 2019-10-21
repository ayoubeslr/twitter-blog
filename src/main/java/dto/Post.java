package dto;

import java.sql.Date;
import java.util.ArrayList;

public class Post {

	private String message;
	private Date date_post;
	private int nbLike;
	
	private Utilisateur utilisateur;
	
	private ArrayList<Commentaire> commentaires;

	public Post(String message, Date date_post, int nbLike, Utilisateur utilisateur, ArrayList<Commentaire> commentaires) {
		this.message = message;
		this.date_post = date_post;
		this.nbLike = nbLike;
		this.utilisateur=utilisateur;
		this.commentaires = commentaires;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate_post() {
		return date_post;
	}

	public void setDate_post(Date date_post) {
		this.date_post = date_post;
	}

	public int getNbLike() {
		return nbLike;
	}

	public void setNbLike(int nbLike) {
		this.nbLike = nbLike;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public ArrayList<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(ArrayList<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	
	
	
}
