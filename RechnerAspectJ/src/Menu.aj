
public aspect Menu {
	private pointcut showpc():
		execution(public static void Main.showTextMenu());
	
	before(): showpc(){
		
		System.out.println("Dies ist das Hauptmenü");
	}
}