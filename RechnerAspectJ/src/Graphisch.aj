
public aspect Graphisch {
	
	private pointcut showpc():
		execution(public static void Main.main(*));
	
	void around(): showpc(){
		
		proceed();
		Main.showGraphicalMenu();
	}
}