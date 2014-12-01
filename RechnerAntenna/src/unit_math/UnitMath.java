//#if MatheEinheit
package unit_math;

import java.util.ArrayList;

public class UnitMath {
	
	public UnitMath(){
		
		ArrayList<String> menuOptions = new ArrayList<String>();
		
		//#if Grundrechenarten
			menuOptions.add("Simpler Taschenrechner");
		//#endif
		//#if Wissenschaftlich
			menuOptions.add("Wissenschaftlicher Taschenrechner");
		//#endif	
		//#if Kurvendiskussion
			menuOptions.add("Kurvendiskussion");
		//#endif
			
		System.out.println("== MATH UNIT EXECUTED ==");
		new MathMenu(menuOptions);
		
		
		//System.out.println("Choose the Tool:");
		//System.out.println("No Tools are activated");
	}
}
//#endif
