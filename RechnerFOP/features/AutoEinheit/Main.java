/**
 * TODO description
 */
public class Main {
	public static void main (String[] args){
		
		MenuInterface carMenu = new CarMenu("Auto Einheit", mainMenu);
		featureMenus.add(carMenu);
		
		original(args);
	}
}