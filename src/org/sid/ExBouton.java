package org.sid;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExBouton extends JFrame {
	
	public ExBouton() {
		//Appel du constructeur de la classe mère
		super();
		//créeation du label
		JLabel label = new JLabel("Exemple de bouton");
		//Création du bouton
		JButton bouton = new JButton(" Quitter ");
		//Création du panel avec comme disposition BorderLayout
		JPanel panel = new JPanel(new BorderLayout());
		//Ajout du label au panel au nord
		panel.add(label, BorderLayout.NORTH);
		//Ajout du bouton au panel au dud
		panel.add(bouton, BorderLayout.SOUTH);
		//Ajout de l'action sur le bouton
		bouton.addActionListener(new actionButton());
		//modification du panel de la fenêtre
		this.setContentPane(panel);
		//Redéfinition de la taille de la fenêtre
		this.pack();
	}
	
	private class actionButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Vous avez cliqué!");
		}
		
	}
	

	public static void main(String[] args) {
		//Création d'un objet de la classe
		ExBouton exemple = new ExBouton();
		//Affichage de la fenêtre
		exemple.setVisible(true);
	}

}
