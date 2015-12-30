package Donnees;

public class Carte {
	private String nom;
	private String type;
	private int numero;
	private String description;
	
	public Carte(String nom, String type, int numero, String description){		 
		 this.nom = nom;
		 this.type = type;
		 this.numero= numero;
		 this.description = description;		 
	}

	public String getNom() {
		return nom;
	}
	
	public String getType(){
		
		return type;
	}
	
	public int getNumero(){
		
		return numero;
	}

	public String getDescription(){
		
		return description;
	}
}
