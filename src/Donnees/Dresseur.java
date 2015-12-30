package Donnees;
import java.util.*;

public class Dresseur extends Carte{
	private static String tabTypeDresseur[]={"normal", "dressuer-objet", "objet", "high-teck", "fossile"};
	private String dresseurType;

	public Dresseur(String nom, String type, int numero, String description,String dresseurType){
		super(nom, type, numero, description);
		this.dresseurType = dresseurType;
	}
	
	public String getDresseurType(){
		return dresseurType;
	}

	public static String[] getTabTypeDresseur(){		
		return tabTypeDresseur;		
	}
}
