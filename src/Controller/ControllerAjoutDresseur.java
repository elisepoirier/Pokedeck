package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Donnees.Carte;
import Donnees.Dresseur;
import IHM.AjoutDresseur;

public class ControllerAjoutDresseur implements ActionListener {

	private AjoutDresseur vueDresseur;
	
	public ControllerAjoutDresseur(AjoutDresseur vueDresseur){		
		this.vueDresseur=vueDresseur;		
	}
	
	public void actionPerformed(ActionEvent e) {		
		if(((JButton)(e.getSource())).getText()=="Ajouter"){			
			try{
				Carte dresseur = new Dresseur(vueDresseur.getNomDresseur(), vueDresseur.getTypeDresseur(),vueDresseur.getNumeroDresseur(),vueDresseur.getDescriptionDresseur(), vueDresseur.getTypeCarteDresseur());
				
				JOptionPane.showMessageDialog(vueDresseur,
						"La carte "+ vueDresseur.getNomDresseur() +" a été ajoutée",
						"Confirmation", JOptionPane.INFORMATION_MESSAGE);
				
				vueDresseur.setVisible(false);
				
			}catch(NullPointerException | NumberFormatException e1){				
				JOptionPane.showMessageDialog(vueDresseur,
						"Champ mal renseigné ou vide",
						"Erreur", JOptionPane.ERROR_MESSAGE);				
			}		
		}			
	}
}
		


