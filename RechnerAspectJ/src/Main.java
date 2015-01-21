import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * TODO description
 */
public class Main {
	
	
	//static ArrayList<MenuInterface> featureMenus = new ArrayList<MenuInterface>();
	//static ArrayList<FeatureInterface> features = new ArrayList<FeatureInterface>();
	
	//static MenuInterface mainMenu = new MainMenu("Haupt Menü");
	
	static ArrayList<String> featureMenus = new ArrayList<String>();
	static ArrayList<String[]> features = new ArrayList<String[]>();
	
	public static void showTextMenu(){
		int counter = 0;
		System.out.println("Textuell");
		for(int i=0; i < featureMenus.size(); i++){			
			System.out.println(featureMenus.get(i));
			
			for(int j=0; j < features.size(); j++){
				//System.out.println(features.get(j)[0]);
				if(features.get(j)[1] == featureMenus.get(i)){
					counter++;
					System.out.println("Menüpunkt " + counter + " : " + features.get(j)[0]);
				}
			}
		}
		
		// User Input
		System.out.println("Bitte wähle die Nummer des gewünschten Features!");
		int iInput;
		Scanner userInput = new Scanner(System.in);
		iInput = userInput.nextInt();
		
		System.out.println("== MENU ==");
		if(iInput-1 >= features.size())
			System.err.println("No such option is available!");
		else
			executeFeature(features.get(iInput-1)[0]);
		
	}
	
	public static void showGraphicalMenu(){
		System.out.println("Graphical");
		JFrame frame = new JFrame("Main Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize( new Dimension(215,550));
		frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width /2 - 107, Toolkit.getDefaultToolkit().getScreenSize().height /2 -225);
		frame.setLayout(new FlowLayout());
		
		for(int i = 0; i < featureMenus.size() ;i++ ){
			JLabel labelName = new JLabel(featureMenus.get(i));
			labelName.setPreferredSize( new Dimension(190, 15));
			frame.add(labelName);
				
			for(int j = 0; j < features.size(); j++){
				if( features.get(j)[1] == featureMenus.get(i)){
					JButton button = new JButton( features.get(j)[0] );
					button.setPreferredSize( new Dimension(190, 25));
					frame.add( button );
					
					ActionListener al = new ActionListener() {
						   @Override public void actionPerformed( ActionEvent e ) {
						      	
							   String actSource = ((JButton)e.getSource()).getText();
								for(int i = 0; i < features.size() ;i++){
									if(features.get(i)[0].equals(actSource)){
										
										executeGFeature(features.get(i)[0]);
									}
								}
							   
						   }
					};
						
					button.addActionListener(al);
				}
			}
			
		}
		
		frame.setVisible(true);
	}
	
	public static void addMenus(ArrayList<String> featureMenus){
		// als Pointcut und Listenübergabe
	}
	
	public static void addFeatures(ArrayList<String[]> features){
		// als Pointcut und Listenübergabe
	}
	
	public static void executeGFeature(String feature){
		// als Pointcut
	}
	public static void executeFeature(String feature){
		// als Pointcut
	}
	
	public static void main (String[] args){
		
		//featureMenus.add(mainMenu);
		//mainMenu.showMenu(featureMenus, features);
		addMenus(featureMenus);
		addFeatures(features);
		
	}
}