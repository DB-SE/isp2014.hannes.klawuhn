import java.util.ArrayList; 
/*
import main.FeatureInterface;
import main.MenuInterface;
*/
/**
 * TODO description
 */
public  class  TimeMenu  implements MenuInterface {
	
	public String menuName;

	
	public MenuInterface parent;

	
	
	public TimeMenu(String name, MenuInterface parent){
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
