
public aspect Textuell {
	
	private pointcut showpc():
		execution(public static void Main.main(*));
	
	void around(): showpc(){
		
		proceed();
		Main.showTextMenu();
	}
	
}