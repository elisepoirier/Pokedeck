package Donnees;

public class Pokemon extends Carte{

	private static String tabTypePokemon[]={"acier","combat","fee","dragon","eau","electrique","feu","glace","insecte","normal","plante","poison","psy","roche","sol","spectre","tenebres","vol"};
	private static String tabEvolution[]={"base","niveau 1","niveau 2", "bebe pokemon","mega evolution"};
	private String typePokemon;
	private int pv;
	private int niveau;	
	private String evolution;
	private String faiblesse;
	private String resistance;
	
	public Pokemon(String nom, String type, int numero, String description, String typePokemon, int pv, int niveau, String evolution, String faiblesse, String resistance){
		super(nom, type, numero, description);
		this.typePokemon = typePokemon;
		this.pv = pv;
		this.niveau = niveau;
		this.evolution = evolution;
		this.faiblesse = faiblesse;
		this.resistance = resistance;
	}


	public static String[] getTabTypePokemon(){		
		return tabTypePokemon;
	}
	
	public static String[] getTabEvolution(){		
		return tabEvolution;
	}


	public String getTypePokemon() {
		return typePokemon;
	}

	public int getPv() {
		return pv;
	}
	
	public int getNiveau() {
		return niveau;
	}

	public String getEvolution() {
		return evolution;
	}
	
	public String getFaiblesse() {
		return faiblesse;
	}
	
	public String getResisatnce() {
		return resistance;
	}
}
