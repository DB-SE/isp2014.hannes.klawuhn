package main;

import java.util.ArrayList;

public class Main {

	public static void main (String[] args){
		/* Initialisieren der "abstrakten" Features (Men�s) */
		MenuInterface mainMenu = new MainMenu("Haupt Men�");
		MenuInterface mathMenu = new MathMenu("Mathe Einheit", mainMenu);
		MenuInterface carMenu = new CarMenu("Auto Einheit", mainMenu);
		MenuInterface financeMenu = new FinanceMenu("Finanz Einheit", mainMenu);
		MenuInterface timeMenu = new TimeMenu("Zeit Einheit", mainMenu);
		MenuInterface physicsMenu = new PhysicsMenu("Physik Einheit", mainMenu);
		
		/* Initialisieren der Features */
		FeatureInterface simpleCalc = new SimpleCalc("Simpler Rechner", mathMenu);
		FeatureInterface scienceCalc = new ScienceCalc("Wissenschaftlicher Rechner", mathMenu);
		FeatureInterface analysisCalc = new analysisCalc("Kurvendiskussion", mathMenu);
		FeatureInterface currencyCalc = new CurrencyCalc("W�hrungsumrechner", financeMenu);
		
		ArrayList<MenuInterface> featureMenus = new ArrayList<MenuInterface>();
		ArrayList<FeatureInterface> features = new ArrayList<FeatureInterface>();
		
		/* Einf�gen der Features in die daf�r vorgesehenen Listen --> (De-)Aktivieren */
		featureMenus.add(mainMenu);
		featureMenus.add(mathMenu);
		//featureMenus.add(carMenu);
		featureMenus.add(financeMenu);
		//featureMenus.add(timeMenu);
		//featureMenus.add(physicsMenu);
		
		features.add(simpleCalc);
		features.add(scienceCalc);
		features.add(analysisCalc);
		features.add(currencyCalc);
		
		mainMenu.showMenu(featureMenus, features);
		
		
	}
}
