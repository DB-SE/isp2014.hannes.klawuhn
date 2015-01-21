import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;


public aspect Kurvendiskussion {
	
	final String name = "Kurvendiskussion";
	
	private pointcut showpc(ArrayList<String[]> features):
		execution(public static void Main.addFeatures(ArrayList<String[]>)) && args(features);
	
	private pointcut executeG(String feature):
		call(public static void Main.executeGFeature(String)) && args(feature);
	
	private pointcut executeT(String feature):
		call(public static void Main.executeFeature(String)) && args(feature);
	
	void around(ArrayList<String[]> features): showpc(features){
		proceed(features);
		String featureArray[] = {"Kurvendiskussion","Mathe Einheit"};
		
		features.add(featureArray);
		
	}
	
	after(String feature): executeG(feature){
		if(feature.equals(name)){
			JFrame frame = new JFrame("Math Menu");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			frame.setSize( new Dimension(350,150));
			frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width /2 - 175, Toolkit.getDefaultToolkit().getScreenSize().height /2 -75);
			frame.setLayout(new FlowLayout());
			
			frame.add(new JLabel("Bitte einen Term eingeben .. nur Zahlen und +-/*() erlaubt!"));
			frame.setVisible(true);
		}
	}
	
	after(String feature): executeT(feature){
		if(feature.equals(name)){
			System.out.println(name);
		}
	}
}