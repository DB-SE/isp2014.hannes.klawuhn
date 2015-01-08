/**
 * TODO description
 */
public class Main {
	public static void main (String[] args){
		
		MenuInterface mathMenu = new MathMenu("Mathe Einheit", mainMenu);
		featureMenus.add(mathMenu);
		
		original(args);
	}
}