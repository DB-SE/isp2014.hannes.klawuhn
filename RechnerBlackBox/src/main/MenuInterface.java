package main;

import java.util.ArrayList;

public interface MenuInterface {
	
	//public String menuName = "Default";

	public String getName();
	public MenuInterface getParent();
	public void showMenu( ArrayList<MenuInterface> featureMenus , ArrayList<FeatureInterface> features ); 
	public void showFeatMenu( ArrayList<FeatureInterface> features );
}
