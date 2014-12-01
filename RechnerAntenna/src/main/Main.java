package main;

import java.util.ArrayList;

public class Main {
		
	public static void main(String[] args){
		
		System.out.println("..:: Alles-Rechner V0.3 ::..");
		
		/**if(args == null || args.length == 0){
			System.err.print(" Wrong Call -- no arguments \n");
			System.out.println("Please call the program with one or more of the following arguments:");
		}else{**/
			
			ArrayList<String> menuOptions = new ArrayList<String>();
			
			//#if MatheEinheit
				menuOptions.add("Math Unit");
			//#endif
			//#if PhysikEinheit
//@				menuOptions.add("Physics Unit");
			//#endif
			//#if FinanzEinheit
				menuOptions.add("Finance Unit");
			//#endif
			//#if TimeEinheit
//@				menuOptions.add("Time Unit");
			//#endif
			//#if AutoEinheit
//@				menuOptions.add("Car Unit");
			//#endif
			
			new Menu(menuOptions);
		}
		
		//System.out.println("Debug");
		
	/**}**/
	
	
}
