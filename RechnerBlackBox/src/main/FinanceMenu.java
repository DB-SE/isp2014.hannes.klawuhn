package main;

import java.util.ArrayList;

public class FinanceMenu implements MenuInterface {
	public String menuName;
	public MenuInterface parent;
	
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
		
	}
}
