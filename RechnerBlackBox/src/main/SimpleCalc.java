package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleCalc implements FeatureInterface {

	public String featureName;
	public MenuInterface parent;
	
	public SimpleCalc(String name, MenuInterface parent){
		this.featureName = name;
		this.parent = parent;
	}
	
	@Override
	public String getName() {
		return this.featureName;
	}

	@Override
	public MenuInterface getParent() {
		return this.parent;
	}

	@Override
	public void showFeature() {
		/* Initialisieren des Fensters */		
		JFrame frame = new JFrame("Math Menu");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setSize( new Dimension(350,350));
		frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width /2 - 175, Toolkit.getDefaultToolkit().getScreenSize().height /2 -175);
		frame.setLayout(new FlowLayout());
		
		frame.add(new JLabel("hier Simplen Rechner einfügen"));
		// TODO: Rechner Funktionalität
		frame.setVisible(true);

	}

}
