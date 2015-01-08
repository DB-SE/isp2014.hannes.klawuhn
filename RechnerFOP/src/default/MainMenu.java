import java.awt.Dimension; 
import java.awt.FlowLayout; 
import java.awt.Toolkit; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.util.ArrayList; 

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
/*
import FeatureInterface;
import MenuInterface;
*/
/**
 * TODO description
 */
public  class  MainMenu  implements MenuInterface {
	
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
		frame.setSize( new Dimension(215,550));
		frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width /2 - 107, Toolkit.getDefaultToolkit().getScreenSize().height /2 -225);
		frame.setLayout(new FlowLayout());
		
		
	 	frame.add(new JLabel("Haupt Menü"));
		for(int i = 0; i < featureMenus.size() ;i++ ){
			if( featureMenus.get(i).getParent() == this ){
				JLabel labelName = new JLabel(featureMenus.get(i).getName());
				labelName.setPreferredSize( new Dimension(190, 15));
				frame.add(labelName);
				
				for(int j = 0; j < features.size(); j++){
					System.out.println("Test");
					System.out.println(features.get(j).getName());
					System.out.println(features.get(j).getParent());
					System.out.println(featureMenus.get(i).getName());
					if( features.get(j).getParent() == featureMenus.get(i).getName()){
						//JLabel actFeatName = new JLabel(features.get(j).getName());
						//frame.add(actFeatName);
						
						JButton button = new JButton( features.get(j).getName() );
						button.setPreferredSize( new Dimension(190, 25));
						frame.add( button );
						
						ActionListener al = new ActionListener() {
							   @Override public void actionPerformed( ActionEvent e ) {
							      								   
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
				
			}
			//DEBUG
			//System.out.println(featureMenus.get(i).getName());
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
