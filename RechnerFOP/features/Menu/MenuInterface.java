import java.util.ArrayList;

//import main.FeatureInterface;
//import main.MenuInterface;

/**
 * TODO description
 */
public interface MenuInterface {
	public String getName();
	public MenuInterface getParent();
	public void showMenu( ArrayList<MenuInterface> featureMenus , ArrayList<FeatureInterface> features ); 
	public void showFeatMenu( ArrayList<FeatureInterface> features );
}