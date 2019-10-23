package dto;

public class Commentaire {
	
	private String libelle;
	
	private Utilisateur utilisateur;
	private Post post;

	public Commentaire(String libelle, Utilisateur utilisateur, Post post) {
		this.libelle = libelle;
		this.utilisateur = utilisateur;
		this.post = post;
	}

	public Commentaire() {
		// TODO Auto-generated constructor stub
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
	
	

}
