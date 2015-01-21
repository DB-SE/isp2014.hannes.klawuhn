import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public aspect Waehrungsumrechner {
final String name = "Waehrungsrechner";
	
	public double calculate(String wert, String getCur, String toCur){
		double result = 2.4;
		return result;
	}
	
	private pointcut showpc(ArrayList<String[]> features):
		execution(public static void Main.addFeatures(ArrayList<String[]>)) && args(features);
	
	private pointcut executeG(String feature):
		call(public static void Main.executeGFeature(String)) && args(feature);
	
	private pointcut executeT(String feature):
		call(public static void Main.executeFeature(String)) && args(feature);
	
	void around(ArrayList<String[]> features): showpc(features){
		proceed(features);
		String featureArray[] = {"Waehrungsrechner","Finanz Einheit"};
		
		features.add(featureArray);
		
	}
	
	after(String feature): executeG(feature){
		if(feature.equals(name)){

			JFrame frame = new JFrame("Math Menu");
			frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			frame.setSize( new Dimension(350,150));
			frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width /2 - 175, Toolkit.getDefaultToolkit().getScreenSize().height /2 -75);
			frame.setLayout(new FlowLayout());
			
			frame.add(new JLabel("Bitte einen Term eingeben .. nur Zahlen erlaubt!"));
			
			final JTextField tfFirstCur = new JTextField("1", 6);
			final JTextField tfSecCur = new JTextField("", 6);
			
			String[] curChoices = { "Euro","GBP", "USD","Yen"};
			
		    final JComboBox<String> cbFirst = new JComboBox<String>(curChoices);
		    final JComboBox<String> cbSecond = new JComboBox<String>(curChoices);
			
		    frame.getContentPane().add(tfFirstCur);
		    frame.getContentPane().add(cbFirst);
		    
		    frame.getContentPane().add(cbSecond);
		    frame.getContentPane().add(tfSecCur);
		    
		    JButton calcButton = new JButton("Umrechnen");
		    
		    calcButton.addActionListener(new ActionListener() {
				@Override public void actionPerformed( ActionEvent e ) {
				      String wert = tfFirstCur.getText();
				      String getCur = (String)cbFirst.getSelectedItem();
				      String toCur = (String)cbSecond.getSelectedItem();
					  double result = calculate(wert, getCur, toCur);
					  tfSecCur.setText("" + result);
			}});
		    
		    frame.getContentPane().add(calcButton);
		    
			frame.setVisible(true);
			
		}
	}
	
	after(String feature): executeT(feature){
		if(feature.equals(name)){
			System.out.println(name);
		}
	}
}