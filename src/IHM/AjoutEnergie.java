package IHM;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

import Controller.ControllerAjoutEnergie;
import Donnees.Energie;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.JScrollPane;

public class AjoutEnergie extends JDialog {

	private JPanel contentPanel = new JPanel();
	private JTextField textFieldNom;
	private JTextField textFieldType;
	private JTextField textFieldNumero;
	private JTextArea textAreaDescription;
	private ButtonGroup radioGroup = new ButtonGroup();
	

	public AjoutEnergie() {
		setTitle("Ajouter une énergie");
		setBounds(100, 100, 450, 550);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(91, 30, 86, 20);
		contentPanel.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBounds(30, 33, 41, 14);
		contentPanel.add(lblNom);
		
		textFieldType = new JTextField();
		textFieldType.setEditable(false);
		textFieldType.setText("energie");
		textFieldType.setBounds(268, 30, 86, 20);
		contentPanel.add(textFieldType);
		textFieldType.setColumns(10);
		
		JLabel lblType = new JLabel("type:");
		lblType.setBounds(224, 33, 41, 14);
		contentPanel.add(lblType);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(30, 80, 41, 14);
		contentPanel.add(lblNumero);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(91, 77, 86, 20);
		contentPanel.add(textFieldNumero);
		textFieldNumero.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(224, 80, 71, 14);
		contentPanel.add(lblDescription);
		
		JLabel lblTypeEnergie = new JLabel("Type d'energie : (1 choix)");
		lblTypeEnergie.setBounds(30, 139, 162, 14);
		contentPanel.add(lblTypeEnergie);
		
		String[] EnergieType = Energie.getEnergyType();
		JRadioButton[] bouton = new JRadioButton[EnergieType.length];
		int x = 235;
		int y =145;
		int width = 109; 
		int height = 23;
		for (int i = 0; i < bouton.length; i++) {
		   bouton[i] = new JRadioButton(EnergieType[i]);
		   bouton[i].setActionCommand(EnergieType[i]);
		   bouton[i].setBounds(x,y=y+26,width,height);
		   radioGroup.add(bouton[i]);		
		   contentPanel.add(bouton[i]);
		}

		 
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ControllerAjoutEnergie(this));
		btnAjouter.setBounds(268, 290, 89, 23);
		contentPanel.add(btnAjouter);
			
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(224, 112, 194, 86);
		contentPanel.add(scrollPane);
			
		textAreaDescription = new JTextArea();
		scrollPane.setViewportView(textAreaDescription);
		 
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
		

		
	}
	

	public Object getTypeCarteEnergie(){
		 
		return radioGroup.getSelection().getActionCommand();
	}
	
	public String getNomEnergie(){
		
		return textFieldNom.getText().toLowerCase();
	}
	
	public String getTypeEnergie(){
		
		return textFieldType.getText().toLowerCase();
	}
	
	public int getNumeroEnergie(){
		
		return Integer.parseInt(textFieldNumero.getText());
	}
	
	public String getDescriptionEnergie(){
		
		return textAreaDescription.getText();
	}

}


 