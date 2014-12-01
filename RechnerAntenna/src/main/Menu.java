package main;

import java.util.ArrayList;
import java.util.Scanner;

//#if AutoEinheit
import unit_car.UnitCar;
//#endif
//#if ZeitEinheit
//@import unit_time.UnitTime;
//#endif
//#if FinanzEinheit
//@import unit_finance.UnitFinance;
//#endif
//#if PhysikEinheit
//@import unit_physics.UnitPhysics;
//#endif
//#if MatheEinheit
import unit_math.UnitMath;
//#endif

public class Menu {
	public static ArrayList<String> menuOptions = new ArrayList<String>();
	
	public Menu(ArrayList<String> menuOptions){
		this.menuOptions = menuOptions;
		System.out.println("== MENU ==");
		System.out.println("Press Number to execute Unit");
		for(int i = 0; i < menuOptions.size() ;i++)
			System.out.println("(" + i + ") " + menuOptions.get(i));
		System.out.println();
		
		System.out.println("Please select your favorite unit");
		
		// User Input
		int iInput;
		Scanner userInput = new Scanner(System.in);
		iInput = userInput.nextInt();
		
		System.out.println("== MENU ==");
		if(iInput >= menuOptions.size())
			System.err.println("No such option is available!");
		else
			executeOption(iInput);
	}
	
	private static void executeOption(int userInput){
		System.out.println("You chose the " + menuOptions.get(userInput));
		String resArg = menuOptions.get(userInput);
		//#if MatheEinheit
		if(resArg.equalsIgnoreCase("MATH UNIT"))
			new UnitMath();
		else 
		//#endif
		//#if PhysikEinheit
//@		if(resArg.equalsIgnoreCase("PHYSICS UNIT"))
//@			new UnitPhysics();
//@		else 
		//#endif
		//#if FinanzEinheit
//@		if(resArg.equalsIgnoreCase("FINANCE UNIT"))
//@			new UnitFinance();
//@		else 
		//#endif
		//#if ZeitEinheit
//@		if(resArg.equalsIgnoreCase("TIME UNIT"))
//@			new UnitTime();
//@		else 
		//#endif
		//#if AutoEinheit
		if(resArg.equalsIgnoreCase("CAR UNIT"))
			new UnitCar();
		//#endif
	}
}
