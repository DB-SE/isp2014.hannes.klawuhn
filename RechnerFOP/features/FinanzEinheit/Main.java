/**
 * TODO description
 */
public class Main {
	public static void main (String[] args){
		
		MenuInterface financeMenu = new FinanceMenu("Finanz Einheit", mainMenu);
		featureMenus.add(financeMenu);
		
		original(args);
	}
}