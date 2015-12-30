package IHM;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;


import Controller.ControllerAjoutPokemon;
import Donnees.Pokemon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AjoutPokemon extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNom;
	private JTextField txtPokemon;
	private JTextField textFieldNumero;
	private JTextField textFieldPv;
	private JTextField textFieldLvl;
	private JComboBox<String> comboBoxType;
	private JComboBox<String> comboBoxEvolution;
	private JTextArea textAreaDesc;
	private JTextField textFieldFaibelsse;
	private JTextField textFieldResistance;
	



	public AjoutPokemon() {
		setTitle("Add Pokemon Card");
		setBounds(100, 100, 450, 500);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 1, 493);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBounds(28, 34, 46, 14);
		getContentPane().add(lblNom);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(84, 31, 86, 20);
		getContentPane().add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(197, 34, 46, 14);
		getContentPane().add(lblType);
		
		txtPokemon = new JTextField();
		txtPokemon.setEditable(false);
		txtPokemon.setText("Pokemon");
		txtPokemon.setBounds(285, 31, 125, 20);
		getContentPane().add(txtPokemon);
		txtPokemon.setColumns(10);
		
		JLabel lblNumeroDeCarte = new JLabel("Numero:");
		lblNumeroDeCarte.setBounds(28, 74, 51, 14);
		getContentPane().add(lblNumeroDeCarte);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(84, 71, 86, 20);
		getContentPane().add(textFieldNumero);
		textFieldNumero.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(30, 124, 75, 14);
		getContentPane().add(lblDescription);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(103, 124, 163, 78);
		getContentPane().add(scrollPane);
		
		textAreaDesc = new JTextArea();
		scrollPane.setViewportView(textAreaDesc);
		
		JLabel lblTypePokemon = new JLabel("Type Pokemon :");
		lblTypePokemon.setBounds(197, 74, 96, 14);
		getContentPane().add(lblTypePokemon);
		
		comboBoxType = new JComboBox<String>();
		
		String[] lesTypes = Donnees.Pokemon.getTabTypePokemon();
		 for (int i = 0; i < lesTypes.length; i++) {
			 comboBoxType.addItem(lesTypes[i]);
		 
		 }
		
		
		comboBoxType.setBounds(285, 71, 123, 20);
		getContentPane().add(comboBoxType);
		
		JLabel lblPv = new JLabel("PV :");
		lblPv.setBounds(285, 124, 46, 14);
		getContentPane().add(lblPv);
		
		textFieldPv = new JTextField();
		textFieldPv.setBounds(321, 121, 89, 20);
		getContentPane().add(textFieldPv);
		textFieldPv.setColumns(10);
		
		JLabel lblLvl = new JLabel("LVL:");
		lblLvl.setBounds(285, 168, 46, 14);
		getContentPane().add(lblLvl);
		
		textFieldLvl = new JTextField();
		textFieldLvl.setBounds(321, 165, 89, 20);
		getContentPane().add(textFieldLvl);
		textFieldLvl.setColumns(10);
		
		JLabel lblEvolutionPokmon = new JLabel("Evolution Pok\u00E9mon:");
		lblEvolutionPokmon.setBounds(28, 230, 112, 14);
		getContentPane().add(lblEvolutionPokmon);
		
		comboBoxEvolution = new JComboBox<String>();
		
		String[] lesEvolutions = Donnees.Pokemon.getTabEvolution();
		for (int i = 0; i < lesEvolutions.length; i++) {
			 comboBoxEvolution.addItem(lesEvolutions[i]);		 
		}		
		 
		comboBoxEvolution.setBounds(150, 227, 116, 20);
		getContentPane().add(comboBoxEvolution);
		
		JButton btnValider = new JButton("Ajouter");
		btnValider.addActionListener(new ControllerAjoutPokemon(this));
		btnValider.setBounds(28, 392, 89, 23);
		getContentPane().add(btnValider);
		
		JLabel lblFaiblesse = new JLabel("Faiblesse:");
		lblFaiblesse.setBounds(28, 288, 72, 14);
		getContentPane().add(lblFaiblesse);
		
		JLabel labelResistance = new JLabel("Resistance:");
		labelResistance.setHorizontalAlignment(SwingConstants.LEFT);
		labelResistance.setBounds(28, 332, 72, 14);
		getContentPane().add(labelResistance);
		
		textFieldFaibelsse = new JTextField();
		textFieldFaibelsse.setColumns(10);
		textFieldFaibelsse.setBounds(103, 285, 86, 20);
		getContentPane().add(textFieldFaibelsse);
		
		textFieldResistance = new JTextField();
		textFieldResistance.setColumns(10);
		textFieldResistance.setBounds(103, 329, 86, 20);
		getContentPane().add(textFieldResistance);
	}

	public String getNomPokemon(){
		return textFieldNom.getText().toLowerCase();
	}
	
	public String getTypeCarte(){
		return txtPokemon.getText();
	}
	
	public int getNumeroPokemon(){
		return Integer.parseInt(textFieldNumero.getText());
	}
	
	public int getPvPokemon(){
		return Integer.parseInt(textFieldPv.getText());
	}
	
	public int getLvlPokemon(){		
		return Integer.parseInt(textFieldLvl.getText());
	}
	
	public String getDescriptionPokemon(){		
		return textAreaDesc.getText();
	}
	
	public String getTypePokemon(){		
		return comboBoxType.getSelectedItem().toString();		
	}
	
	public String getEvolutionPokemon(){		
		return comboBoxEvolution.getSelectedItem().toString();		
	}
	
	public String getFaiblessePokemon(){		
		return textFieldFaibelsse.getText();	
	}
	
	public String getResistancePokemon(){		
		return textFieldResistance.getText();		
	}
}
