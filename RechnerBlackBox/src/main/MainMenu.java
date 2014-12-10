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

public class MainMenu implements MenuInterface {
	public String menuName;
	public MenuInterface parent;
	public ArrayList<MenuInterface> menuList;
	public ArrayList<FeatureInterface> featureList;
	
	public MainMenu(String name){
		this.menuName = name;
		this.parent = null;
	}
	
	public void showMenu( ArrayList<MenuInterface> featureMenus ,ArrayList<FeatureInterface> features){
		
		this.menuList = featureMenus;
		this.featureList = features;
		
		/* Initialisieren des Fensters */		
		JFrame frame = new JFrame("Main Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize( new Dimension(215,250));
		frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width /2 - 107, Toolkit.getDefaultToolkit().getScreenSize().height /2 -125);
		frame.setLayout(new FlowLayout());
		
		
		frame.add(new JLabel("Haupt Menü"));
		for(int i = 0; i < featureMenus.size() ;i++ ){
			if( featureMenus.get(i).getParent() == this ){
				JButton button = new JButton( featureMenus.get(i).getName() );
				button.setPreferredSize( new Dimension(190, 25));
				frame.add( button );
				
				ActionListener al = new ActionListener() {
				   @Override public void actionPerformed( ActionEvent e ) {
				      //testList.get(i).getName();
					  //System.out.println( ((JButton)e.getSource()).getText() );
					  String actSource = ((JButton)e.getSource()).getText();
					  for(int i = 0; i < menuList.size() ;i++){
						  if(menuList.get(i).getName().equals(actSource)){
							  menuList.get(i).showFeatMenu(featureList);
							  //System.out.println("yes");
						  }
					  }
				   }
				};
				
				button.addActionListener(al);
			}
			//DEBUG
			System.out.println(featureMenus.get(i).getName());
		}
		frame.setVisible(true);
	}
	
	public String getName(){
		return this.menuName;
	}
	
	public MenuInterface getParent(){
		return this.parent;
	}
	
	public void showFeatMenu( ArrayList<FeatureInterface> features ){
		
	}
}
