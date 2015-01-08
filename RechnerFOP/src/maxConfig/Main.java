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

	
	 private static void  main__wrappee__Wissenschaftlich  (String[] args){
		FeatureInterface simpleCalc = new SimpleCalc("Wissenschaft Rechner", "Mathe Einheit");
		features.add(simpleCalc);
	
		main__wrappee__Grundrechenarten(args);
	}

	
	 private static void  main__wrappee__Kurvendiskussion  (String[] args){
		FeatureInterface simpleCalc = new AnalysisCalc("Kurvendiskussion", "Mathe Einheit");
		features.add(simpleCalc);
	
		main__wrappee__Wissenschaftlich(args);
	}

	
	 private static void  main__wrappee__FinanzEinheit  (String[] args){
		
		MenuInterface financeMenu = new FinanceMenu("Finanz Einheit", mainMenu);
		featureMenus.add(financeMenu);
		
		main__wrappee__Kurvendiskussion(args);
	}

	
	 private static void  main__wrappee__Waehrungsumrechner  (String[] args){
		FeatureInterface simpleCalc = new SimpleCalc("Währungs Rechner", "Finanz Einheit");
		features.add(simpleCalc);
	
		main__wrappee__FinanzEinheit(args);
	}

	
	 private static void  main__wrappee__PhysikEinheit  (String[] args){
		
		MenuInterface physicsMenu = new PhysicsMenu("Physik Einheit", mainMenu);
		featureMenus.add(physicsMenu);
		
		main__wrappee__Waehrungsumrechner(args);
	}

	
	 private static void  main__wrappee__TimeEinheit  (String[] args){
		
		MenuInterface timeMenu = new TimeMenu("Zeit Einheit", mainMenu);
		featureMenus.add(timeMenu);
		
		main__wrappee__PhysikEinheit(args);
	}

	
	public static void main (String[] args){
		
		MenuInterface carMenu = new CarMenu("Auto Einheit", mainMenu);
		featureMenus.add(carMenu);
		
		main__wrappee__TimeEinheit(args);
	}


}
