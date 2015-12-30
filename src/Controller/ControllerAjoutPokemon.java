package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Donnees.Carte;
import IHM.AjoutPokemon;

public class ControllerAjoutPokemon implements ActionListener {

	private AjoutPokemon vuePokemon;
	
	public ControllerAjoutPokemon(AjoutPokemon vuePokemon) {		
		this.vuePokemon = vuePokemon;
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		if(((JButton)(e.getSource())).getText()=="Ajouter"){			
			try{				
				Carte pokemon = new Donnees.Pokemon(vuePokemon.getNomPokemon(), vuePokemon.getTypeCarte(), vuePokemon.getNumeroPokemon(),vuePokemon.getDescriptionPokemon(),vuePokemon.getTypePokemon(),vuePokemon.getPvPokemon(),vuePokemon.getLvlPokemon(), vuePokemon.getEvolutionPokemon(),vuePokemon.getFaiblessePokemon(),vuePokemon.getResistancePokemon());
				
				JOptionPane.showMessageDialog(vuePokemon,
					"La carte "+ vuePokemon.getNomPokemon() +" a été ajoutée",
					"Confirmation", JOptionPane.INFORMATION_MESSAGE);
				
				vuePokemon.setVisible(false);				
			}catch(NullPointerException | NumberFormatException e1){				
				JOptionPane.showMessageDialog(vuePokemon,
					"Champ mal renseigné ou vide",
					"Erreur", JOptionPane.ERROR_MESSAGE);				
			}
		}
	}

}
