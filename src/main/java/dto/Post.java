package dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import java.util.ArrayList;

@Entity
@Table(name= "post")
public class Post {

	@Id
	private int id_post;
	private String message;
	private Date date_post;
	private int nbLike;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="utilisateur_id")
	private Utilisateur utilisateur;
	

	public Post() {
		
	}
	
	public Post(String message, Date date_post, int nbLike, Utilisateur utilisateur) {
		this.message = message;
		this.date_post = date_post;
		this.nbLike = nbLike;
		this.utilisateur=utilisateur;
	}
	
	

	public int getId_post() {
		return id_post;
	}



	public void setId_post(int id_post) {
		this.id_post = id_post;
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


	
	
}
