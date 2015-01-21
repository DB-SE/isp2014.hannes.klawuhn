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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public aspect Grundrechenarten {
	
	final String name = "Grundrechenarten";
	
	/* 
	 *  Code kopiert von 
	 * 	http://codekicker.de/fragen/Komplexen-Term-berechnen/313
	 */
	public double calculate(String string){
		 ScriptEngine engine =
		            new ScriptEngineManager().getEngineByName("JavaScript");
		        try
		        {
		            Object object = engine.eval("eval("+string+")");
		            if ((object != null) && (object instanceof Number))
		            {
		                return ((Number)(object)).doubleValue();
		            }
		            else
		            {
		                throw new IllegalArgumentException(
		                    "Invalid input: '"+string+"'");
		            }
		        }
		        catch (ScriptException e)
		        {
		            throw new IllegalArgumentException(
		                "Invalid input: '"+string+"'", e);
		        }
	}
	
	private pointcut showpc(ArrayList<String[]> features):
		execution(public static void Main.addFeatures(ArrayList<String[]>)) && args(features);
	
	private pointcut executeG(String feature):
		call(public static void Main.executeGFeature(String)) && args(feature);
	
	private pointcut executeT(String feature):
		call(public static void Main.executeFeature(String)) && args(feature);
	
	void around(ArrayList<String[]> features): showpc(features){
		proceed(features);
		String featureArray[] = {"Grundrechenarten","Mathe Einheit"};
		
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
			
			final JTextField termArea = new JTextField("(1 + 3) / 2 * 10 * (1+22)", 20);
			JButton calcButton = new JButton("Berechne");
			frame.getContentPane().add(termArea);
				
			calcButton.addActionListener(new ActionListener() {
				@Override public void actionPerformed( ActionEvent e ) {
				      String term = termArea.getText();
					  double result = calculate(term);
					  termArea.setText(term + " = " + result);
			}});
			
			frame.getContentPane().add(calcButton);
			// TODO: Rechner Funktionalität
			frame.setVisible(true);
			
		}
	}
	
	after(String feature): executeT(feature){
		if(feature.equals(name)){
			System.out.println(name);
		}
	}
}