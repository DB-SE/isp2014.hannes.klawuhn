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
import main.FeatureInterface;
import main.MenuInterface;
*/
/**
 * TODO description
 */
public class MathMenu implements MenuInterface {
	public String menuName;
	public MenuInterface parent;
	public ArrayList<FeatureInterface> featureList;
	
	public MathMenu(String name, MenuInterface parent){
		this.menuName = name;
		this.parent = parent;
	}
	
	@Override
	public void showMenu(ArrayList<MenuInterface> featureMenus ,ArrayList<FeatureInterface> features) {
		// TODO Auto-generated method stub

	}
	
	public void showFeatMenu( ArrayList<FeatureInterface> features ){
	
	}
	
	public String getName(){
		return this.menuName;
	}
	
	public MenuInterface getParent(){
		return this.parent;
	}

}