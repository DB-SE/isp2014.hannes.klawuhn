import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
/*
import main.FeatureInterface;
import main.MenuInterface;
*/
/**
 * TODO description
 */
public class AnalysisCalc implements FeatureInterface {

	public String featureName;
	public String parent;
	
	public AnalysisCalc(String name, String parent){
		this.featureName = name;
		this.parent = parent;
	}
	
	@Override
	public String getName() {
		return this.featureName;
	}

	@Override
	public String getParent() {
		return this.parent;
	}

	@Override
	public void showFeature() {
		JFrame frame = new JFrame("Math Menu");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setSize( new Dimension(350,150));
		frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width /2 - 175, Toolkit.getDefaultToolkit().getScreenSize().height /2 -75);
		frame.setLayout(new FlowLayout());
		
		frame.add(new JLabel("Bitte einen Term eingeben .. nur Zahlen und +-/*() erlaubt!"));
		frame.setVisible(true);

	}

}