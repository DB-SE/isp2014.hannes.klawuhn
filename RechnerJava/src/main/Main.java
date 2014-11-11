package main;

import java.util.ArrayList;

public class Main {
	private static Settings Settings;
	
	public static void main(String[] args){
		Settings = new Settings();
		
		System.out.println("..:: Alles-Rechner V0.1 ::..");
		
		if(args == null || args.length == 0){
			System.err.print(" Wrong Call -- no arguments \n");
			System.out.println("Please call the program with one or more of the following arguments:");
		}else{
			parseArgs(args);
			ArrayList<String> menuOptions = new ArrayList<String>();
			if(Settings.getMath())
				menuOptions.add("Math Unit");
			if(Settings.getPhysics())
				menuOptions.add("Physics Unit");
			if(Settings.getFinance())
				menuOptions.add("Finance Unit");
			if(Settings.getTime())
				menuOptions.add("Time Unit");
			if(Settings.getCar())
				menuOptions.add("Car Unit");
			
			new Menu(menuOptions);
		}
		
		//System.out.println("Debug");
		
	}
	
	private static void parseArgs(String[] args){
		if(args.length != 0){
			for(int i=0; i < args.length; i++){
				final String resArg = args[i];
				if(resArg.equalsIgnoreCase("MATH"))
					Settings.actMath();
				else if(resArg.equalsIgnoreCase("PHYSICS"))
					Settings.actPhysics();
				else if(resArg.equalsIgnoreCase("FINANCE"))
					Settings.actFinance();
				else if(resArg.equalsIgnoreCase("TIME"))
					Settings.actTime();
				else if(resArg.equalsIgnoreCase("CAR"))
					Settings.actCar();
				else
					System.err.print("Wrong argument");
			}
		}else{
			System.err.print("No arguments");
		}
	}
}
