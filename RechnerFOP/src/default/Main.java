import java.util.ArrayList; /**
 * TODO description
 */
public   class  Main {
	
	
	static ArrayList<MenuInterface> featureMenus = new ArrayList<MenuInterface>();

	
	static ArrayList<FeatureInterface> features = new ArrayList<FeatureInterface>();

	
	
	static MenuInterface mainMenu = new MainMenu("Haupt Menü");

	
	
	 private static void  main__wrappee__Menu  (String[] args){
		
		featureMenus.add(mainMenu);
		
		
		mainMenu.showMenu(featureMenus, features);
		
		
	}

	
	 private static void  main__wrappee__MatheEinheit  (String[] args){
		
		MenuInterface mathMenu = new MathMenu("Mathe Einheit", mainMenu);
		featureMenus.add(mathMenu);
		
		main__wrappee__Menu(args);
	}

	
	 private static void  main__wrappee__Grundrechenarten  (String[] args){
		FeatureInterface simpleCalc = new SimpleCalc("Simpler Rechner", "Mathe Einheit");
		features.add(simpleCalc);
	
		main__wrappee__MatheEinheit(args);
	}

	
	 private static void  main__wrappee__FinanzEinheit  (String[] args){
		
		MenuInterface financeMenu = new FinanceMenu("Finanz Einheit", mainMenu);
		featureMenus.add(financeMenu);
		
		main__wrappee__Grundrechenarten(args);
	}

	
	public static void main (String[] args){
		FeatureInterface simpleCalc = new SimpleCalc("Währungs Rechner", "Finanz Einheit");
		features.add(simpleCalc);
	
		main__wrappee__FinanzEinheit(args);
	}


}
