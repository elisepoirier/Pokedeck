package IHM;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import Controller.ControllerAjout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoixTypeCarteAjouter extends JDialog {

	private final JPanel contentPanel = new JPanel();


	


	public ChoixTypeCarteAjouter() {
		setTitle("Choisir la carte a jouter");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMerciDeChoisir = new JLabel("Type de carte a ajouter");
			lblMerciDeChoisir.setBounds(148, 29, 139, 14);
			contentPanel.add(lblMerciDeChoisir);
		}
		{
			JButton btnEnergie = new JButton("Energie");
			btnEnergie.addActionListener(new ControllerAjout(this));
			btnEnergie.setBounds(163, 66, 89, 23);
			contentPanel.add(btnEnergie);
		}
		{
			JButton btnDresseur = new JButton("Dresseur");
			btnDresseur.addActionListener(new ControllerAjout(this));
			btnDresseur.setBounds(294, 66, 89, 23);
			contentPanel.add(btnDresseur);
		}
		{
			JButton btnPokemon = new JButton("Pokemon");
			btnPokemon.addActionListener(new ControllerAjout(this));
			btnPokemon.setBounds(35, 66, 89, 23);
			contentPanel.add(btnPokemon);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
