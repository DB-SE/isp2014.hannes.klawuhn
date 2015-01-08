import java.util.ArrayList;
/*
import main.CarMenu;
import main.CurrencyCalc;
import main.FeatureInterface;
import main.FinanceMenu;
import main.MainMenu;
import main.MathMenu;
import main.MenuInterface;
import main.PhysicsMenu;
import main.ScienceCalc;
import main.SimpleCalc;
import main.TimeMenu;
import main.analysisCalc;
*/
/**
 * TODO description
 */
public class Main {
	
	static ArrayList<MenuInterface> featureMenus = new ArrayList<MenuInterface>();
	static ArrayList<FeatureInterface> features = new ArrayList<FeatureInterface>();
	
	static MenuInterface mainMenu = new MainMenu("Haupt Menü");
	
	public static void main (String[] args){
		
		featureMenus.add(mainMenu);
		
		
		mainMenu.showMenu(featureMenus, features);
		
		
	}
}