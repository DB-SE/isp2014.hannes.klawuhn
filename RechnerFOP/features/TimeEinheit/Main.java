/**
 * TODO description
 */
public class Main {
	public static void main (String[] args){
		
		MenuInterface timeMenu = new TimeMenu("Zeit Einheit", mainMenu);
		featureMenus.add(timeMenu);
		
		original(args);
	}
}