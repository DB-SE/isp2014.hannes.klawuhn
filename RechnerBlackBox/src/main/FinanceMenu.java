package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FinanceMenu implements MenuInterface {
	public String menuName;
	public MenuInterface parent;
	public ArrayList<FeatureInterface> featureList;
	
	public FinanceMenu(String name, MenuInterface parent){
		this.menuName = name;
		this.parent = parent;
	}
	
	@Override
	public String getName() {
		return this.menuName;
	}

	@Override
	public MenuInterface getParent() {
		return this.parent;
	}

	@Override
	public void showMenu(ArrayList<MenuInterface> featureMenus,ArrayList<FeatureInterface> features) {
		// TODO Auto-generated method stub

	}

	public void showFeatMenu( ArrayList<FeatureInterface> features ){
		this.featureList = features;
		
		/* Initialisieren des Fensters */		
		JFrame frame = new JFrame("Finance Menu");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setSize( new Dimension(215,250));
		frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width /2 - 107, Toolkit.getDefaultToolkit().getScreenSize().height /2 -125);
		frame.setLayout(new FlowLayout());
		
		frame.add(new JLabel("Finanz Menü"));
		for(int i = 0; i < features.size() ;i++ ){
			if( features.get(i).getParent() == this ){
				JButton button = new JButton( features.get(i).getName() );
				button.setPreferredSize( new Dimension(190, 25));
				frame.add( button );
				
				ActionListener al = new ActionListener() {
					 @Override public void actionPerformed( ActionEvent e ) {
					    //testList.get(i).getName();
						//System.out.println( ((JButton)e.getSource()).getText() );
						String actSource = ((JButton)e.getSource()).getText();
						for(int i = 0; i < featureList.size() ;i++){
							if(featureList.get(i).getName().equals(actSource)){
								featureList.get(i).showFeature();
								//System.out.println("yes");
							}
						}
					 }
				};
				
				button.addActionListener(al);
			}
		}
		
		frame.setVisible(true);
	}
}
