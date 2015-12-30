package Donnees;

public class Energie extends Carte {
	private static String tabTypes[] = {"plante","eau","feu","metal","eletrique","psy","combat","obscurite"};
	private String energyType;
	
	public Energie(String nom, String type, int numero, String description, String energyType) {
		super(nom, type, numero, description);
		this.energyType=energyType;
		
	}

	public static  String[] getEnergyType() {
		return tabTypes;
	}
}
