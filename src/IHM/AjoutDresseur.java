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

import Controller.ControllerAjoutDresseur;
import Donnees.Dresseur;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjoutDresseur extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNom;
	private JTextField txtDresseur;
	private JTextField textFieldNumero;
	private JComboBox<String> comboBoxType;
	private JTextArea textAreaDescription;


	public AjoutDresseur() {
		setTitle("Ajouter une carte dresseur");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(23, 36, 46, 14);
		contentPanel.add(lblNom);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(200, 36, 46, 14);
		contentPanel.add(lblType);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(23, 74, 93, 14);
		contentPanel.add(lblNumero);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(23, 132, 70, 14);
		contentPanel.add(lblDescription);
		
		JLabel lblTypeDresseur = new JLabel("Type Dresseur");
		lblTypeDresseur.setBounds(200, 74, 93, 14);
		contentPanel.add(lblTypeDresseur);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(79, 33, 86, 20);
		contentPanel.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		txtDresseur = new JTextField();
		txtDresseur.setEditable(false);
		txtDresseur.setText("Dresseur");
		txtDresseur.setBounds(293, 33, 86, 20);
		contentPanel.add(txtDresseur);
		txtDresseur.setColumns(10);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(77, 71, 86, 20);
		contentPanel.add(textFieldNumero);
		textFieldNumero.setColumns(10);
		
		JScrollPane scrollPaneDesc = new JScrollPane();
		scrollPaneDesc.setBounds(103, 132, 214, 79);
		contentPanel.add(scrollPaneDesc);
		
		textAreaDescription = new JTextArea();
		scrollPaneDesc.setViewportView(textAreaDescription);
		
		comboBoxType = new JComboBox<String>();
	
		String[] typesDresseur = Dresseur.getTabTypeDresseur();
		 for (int i = 0; i < typesDresseur.length; i++) {
			 comboBoxType.addItem(typesDresseur[i]);
		 
		 }
		comboBoxType.setBounds(293, 71, 105, 20);
		contentPanel.add(comboBoxType);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ControllerAjoutDresseur(this));
		btnAjouter.setBounds(23, 263, 89, 23);
		contentPanel.add(btnAjouter);
	}


	public String getNomDresseur(){	
		return textFieldNom.getText().toLowerCase();
	}
	
	public String getTypeDresseur(){		
		return txtDresseur.getText().toLowerCase();
	}
	
	public int getNumeroDresseur(){		
		return Integer.parseInt(textFieldNumero.getText());
	}
	
	public String getDescriptionDresseur(){		
		return textAreaDescription.getText();
	}
	
	public String getTypeCarteDresseur(){		
		return comboBoxType.getSelectedItem().toString();
	}	
}