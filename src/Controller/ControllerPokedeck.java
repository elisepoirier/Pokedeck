package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import IHM.ChoixTypeCarteAjouter;
//import IHM.ConsultationDeck;
import IHM.GestionPokedeck;

public class ControllerPokedeck implements ActionListener {
	
	private GestionPokedeck vueGP;
	private ChoixTypeCarteAjouter choixType = new ChoixTypeCarteAjouter();
	//private ConsultationDeck vueDeck = new ConsultationDeck();
	
	public ControllerPokedeck(GestionPokedeck vueGP){		
		this.vueGP = vueGP;
	}
	
	public void actionPerformed(ActionEvent e) {		
		if(((JButton)(e.getSource())).getText()=="Add"){			
			choixType.setVisible(true);
			}
		if(((JButton)(e.getSource())).getText()=="Consult"){			
			//vueDeck.setVisible(true);			
		}		
	}
}
