package metier;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculatrice extends JFrame implements ActionListener {
	/** Définition des boutons **/
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bVirg; // Boutons chiffres
	JButton bMult, bDiv, bSom, bSoust; // Boutons de calculs de base
	JButton bRes; // Bouton Restultat
	JTextField txt; // Champ d'affichage
	JPanel pTxt, pCalcBase; // Différents pannels
	// chaine de caractère
	final StringBuffer calcul = new StringBuffer();

	public Calculatrice() {
		super("Calculatrice Made by MaLu");

		// Initialisation des bouton et champs de saisie
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bVirg = new JButton(",");
		bMult = new JButton("*");
		bDiv = new JButton("/");
		bSom = new JButton("+");
		bSoust = new JButton("-");
		txt = new JTextField("Calcul ici");
		bRes = new JButton("=");

		// Definition de la taille de base des composants
		b0.setPreferredSize(new Dimension(80, 30));
		b1.setPreferredSize(new Dimension(80, 30));
		b2.setPreferredSize(new Dimension(80, 30));
		b3.setPreferredSize(new Dimension(80, 30));
		b4.setPreferredSize(new Dimension(80, 30));
		b5.setPreferredSize(new Dimension(80, 30));
		b6.setPreferredSize(new Dimension(80, 30));
		b7.setPreferredSize(new Dimension(80, 30));
		b8.setPreferredSize(new Dimension(80, 30));
		b9.setPreferredSize(new Dimension(80, 30));
		bVirg.setPreferredSize(new Dimension(80, 30));
		bMult.setPreferredSize(new Dimension(80, 30));
		bDiv.setPreferredSize(new Dimension(80, 30));
		bSom.setPreferredSize(new Dimension(80, 30));
		bSoust.setPreferredSize(new Dimension(80, 30));
		bRes.setPreferredSize(new Dimension(335, 30));
		txt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt.setBackground(Color.BLACK);
		txt.setForeground(Color.GREEN);
		txt.setFont(new Font("DIALOG", Font.CENTER_BASELINE + Font.BOLD, 12));

		// Declaration des Panels et leurs contenus
		JPanel bCalcBase = new JPanel();
		bCalcBase.add(b7);
		bCalcBase.add(b8);
		bCalcBase.add(b9);
		bCalcBase.add(bSom);
		bCalcBase.add(b4);
		bCalcBase.add(b5);
		bCalcBase.add(b6);
		bCalcBase.add(bSoust);
		bCalcBase.add(b1);
		bCalcBase.add(b2);
		bCalcBase.add(b3);
		bCalcBase.add(bMult);
		bCalcBase.add(b0);
		bCalcBase.add(bVirg);
		bCalcBase.add(bDiv);
		bCalcBase.add(bRes);

		pCalcBase = new JPanel(new GridLayout(1, 1));
		pCalcBase.add(bCalcBase);
		pTxt = new JPanel(new GridLayout(1, 1));
		pTxt.add(txt);

		// Ajout des écouteurs aux différents boutons

		// b0.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("0");
		// txt.setText(calcul.toString());
		// }
		// });
		// b1.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("1");
		// txt.setText(calcul.toString());
		// }
		// });
		// b2.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("2");
		// txt.setText(calcul.toString());
		// }
		// });
		// b3.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("3");
		// txt.setText(calcul.toString());
		// }
		// });
		// b4.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("4");
		// txt.setText(calcul.toString());
		// }
		// });
		// b5.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("5");
		// txt.setText(calcul.toString());
		// }
		// });
		// b6.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("6");
		// txt.setText(calcul.toString());
		// }
		// });
		// b7.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("7");
		// txt.setText(calcul.toString());
		// }
		// });
		// b8.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("8");
		// txt.setText(calcul.toString());
		// }
		// });
		// b9.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("9");
		// txt.setText(calcul.toString());
		// }
		// });
		// bVirg.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append(",");
		// txt.setText(calcul.toString());
		// }
		// });
		// bMult.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("*");
		// txt.setText(calcul.toString());
		// }
		// });
		// bDiv.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("/");
		// txt.setText(calcul.toString());
		// }
		// });
		// bSom.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("+");
		// txt.setText(calcul.toString());
		// }
		// });
		// bSoust.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("-");
		// txt.setText(calcul.toString());
		// }
		// });
		// bRes.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// calcul.append("=");
		// txt.setText(calcul.toString());
		// }
		// });

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bVirg.addActionListener(this);
		bMult.addActionListener(this);
		bDiv.addActionListener(this);
		bSom.addActionListener(this);
		bSoust.addActionListener(this);
		bRes.addActionListener(this);

		// Mise en forme de la fenetre
		// fenetre.setSize(new Dimension(452, 100));
		// fenetre.getContentPane().setLayout(new GridLayout(2, 1));
		// fenetre.getContentPane().add(pTxt);
		// fenetre.getContentPane().add(pCalcBase);
		// fenetre.setLocation(300, 100);
		// fenetre.setVisible(true);
		// fenetre.setResizable(true);
		// fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// fenetre.pack();

		this.setSize(new Dimension(400, 400));
		this.getContentPane().setLayout(new GridLayout(2, 1));
		this.getContentPane().add(pTxt);
		this.getContentPane().add(pCalcBase);
		this.setLocation(300, 100);
		this.setResizable(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "=") {
			// Appeller la fonction calcul
			txt.setText("Ceci était un bouton Fake");
		} else {
			calcul.append(e.getActionCommand());
			txt.setText(calcul.toString());
		}
	}

}
