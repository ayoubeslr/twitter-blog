package dto;

import java.util.ArrayList;

public class Groupe {
	
	private String libelle;
	
	private ArrayList<Utilisateur> utilisateurs;

	public Groupe(String libelle, ArrayList<Utilisateur> utilisateurs) {
		this.libelle = libelle;
		this.utilisateurs = utilisateurs;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public ArrayList<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	

}
