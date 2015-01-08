/**
 * TODO description
 */
public class Main {
	public static void main (String[] args){
		
		MenuInterface physicsMenu = new PhysicsMenu("Physik Einheit", mainMenu);
		featureMenus.add(physicsMenu);
		
		original(args);
	}
}