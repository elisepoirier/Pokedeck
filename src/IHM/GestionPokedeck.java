package IHM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;


import Controller.ControllerPokedeck;
import Controller.ControllerPokedeck;
import Donnees.Pokedeck;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionPokedeck extends JFrame {

	private JPanel contentPane;

	public GestionPokedeck() {
		setTitle("Gestion du pokedeck");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(210, 11, 40, 14);
		contentPane.add(lblMenu);
		
		JButton btnConsulter = new JButton("Consulter Deck");
		btnConsulter.addActionListener(new ControllerPokedeck(this));
		btnConsulter.setBounds(251, 60, 89, 23);
		contentPane.add(btnConsulter);
		
		JButton btnModifier = new JButton("Modifier Carte");
		btnModifier.setBounds(100, 126, 108, 23);
		contentPane.add(btnModifier);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(180, 192, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnSupprimer = new JButton("Supprimer Carte");
		btnSupprimer.setBounds(245, 126, 118, 23);
		contentPane.add(btnSupprimer);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ControllerPokedeck(this));
		btnAjouter.setBounds(111, 60, 89, 23);
		contentPane.add(btnAjouter);
	}
}
