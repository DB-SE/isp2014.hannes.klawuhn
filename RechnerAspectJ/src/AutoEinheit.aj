import java.util.ArrayList;


public aspect AutoEinheit {
	private pointcut showpc(ArrayList<String> menus):
		execution(public static void Main.addMenus(ArrayList<String>)) && args(menus);
	
	void around(ArrayList<String> menus): showpc(menus){
		
		menus.add("Auto Einheit");
		proceed(menus);
	}
}