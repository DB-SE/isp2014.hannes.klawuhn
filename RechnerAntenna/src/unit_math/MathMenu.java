package unit_math;

import java.util.ArrayList;
import java.util.Scanner;

import unit_car.UnitCar;

public class MathMenu {
	
		public static ArrayList<String> menuOptions = new ArrayList<String>();
		
		public MathMenu(ArrayList<String> menuOptions){
			this.menuOptions = menuOptions;
			System.out.println("== MATH MENU ==");
			System.out.println("Press Number to execute Unit");
			for(int i = 0; i < menuOptions.size() ;i++)
				System.out.println("(" + i + ") " + menuOptions.get(i));
			System.out.println();
			
			System.out.println("Please select your favorite tool");
			
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
			//#if Grundrechenarten
			if(resArg.equalsIgnoreCase("Simpler Taschenrechner"))
				System.out.println("Debug");
				//new UnitMath();
			else 
			//#endif
				System.out.println("Irgendetwas lief schief");
		}
}
