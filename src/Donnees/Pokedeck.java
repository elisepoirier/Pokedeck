package Donnees;

import java.util.*;

public class Pokedeck {

	private ArrayList<Carte> listeCarte;
	private String nom;
	
	
	public Pokedeck(ArrayList<Carte> listeCarte, String nom) {
		
		this.listeCarte = listeCarte;
		this.nom = nom;
	}
	
	public ArrayList<Carte> getListeCarte() {
		return listeCarte;
	}

	public String getNom() {
		return nom;
	}
	
	public void AjouterCard(Carte uneCarte){		
		listeCarte.add(uneCarte);		
	}
	
	public void SupprimerCarte(Carte uneCarte){		
		listeCarte.remove(uneCarte);		
	}
}
