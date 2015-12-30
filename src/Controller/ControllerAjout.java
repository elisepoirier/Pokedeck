package Controller;
	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

import Donnees.Pokedeck;
import Donnees.Carte;
import IHM.AjoutPokemon;
import IHM.AjoutEnergie;
import IHM.AjoutDresseur;
import IHM.ChoixTypeCarteAjouter;
	
public class ControllerAjout  implements ActionListener{
		
	private ChoixTypeCarteAjouter choixType;
	
	private AjoutPokemon vuePokemon = new AjoutPokemon();
	private AjoutEnergie vueEnergie = new AjoutEnergie();
	private AjoutDresseur vueDresseur = new AjoutDresseur();

	private int MaxTypeEnergyCarte;
	private int MaxEntraineurCarte;
	private int MaxPokemonCarte;
		
		
	public ControllerAjout(ChoixTypeCarteAjouter choixType){			
		this.choixType = choixType;			
	}
	
	public void actionPerformed(ActionEvent e) {	
		if(((JButton)(e.getSource())).getText()=="Energie"){		
			vueEnergie.setVisible(true);
			choixType.setVisible(false);		
		}
		if(((JButton)(e.getSource())).getText()=="Dresseur"){
			vueDresseur.setVisible(true);
			choixType.setVisible(false);
		}
		if(((JButton)(e.getSource())).getText()=="Pokemon"){			
			vuePokemon.setVisible(true);
			choixType.setVisible(false);
		}		
	}
}
