package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Donnees.Carte;
import Donnees.Energie;
import IHM.AjoutEnergie;

public class ControllerAjoutEnergie implements ActionListener{
	
	private AjoutEnergie vueEnergie;
	
	public ControllerAjoutEnergie(AjoutEnergie vueEnergie){		 
		this.vueEnergie=vueEnergie;	
	}
	
	public void actionPerformed(ActionEvent e) {		
		if(((JButton)(e.getSource())).getText()=="Creer"){		
			try{				
				Carte energie = new Energie(vueEnergie.getNomEnergie(),vueEnergie.getTypeEnergie(), vueEnergie.getNumeroEnergie(), vueEnergie.getDescriptionEnergie(), (String) vueEnergie.getTypeCarteEnergie());
				
				JOptionPane.showMessageDialog(vueEnergie,
						"La carte "+ vueEnergie.getNomEnergie()  +" a été ajoutée",
						"Confirmation", JOptionPane.INFORMATION_MESSAGE);
				
				vueEnergie.setVisible(false);
				
			}catch(NullPointerException | NumberFormatException e1){				
				JOptionPane.showMessageDialog(vueEnergie,
						"Champ mal renseigné ou vide",
						"Erreur", JOptionPane.ERROR_MESSAGE);				
			}		
		}		
	}
}


