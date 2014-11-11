package main;

public class Settings {

	// unit options
	private boolean unit_math;
	private boolean unit_physics;
	private boolean unit_finance;
	private boolean unit_time;
	private boolean unit_car;
	
	// constructor
	public Settings(){
		unit_math = false;
		unit_physics = false;
		unit_finance = false;
		unit_time = false;
		unit_car = false;
	}
	
	// activator
	public void actMath(){
		this.unit_math = true;
	}
	public void actPhysics(){
		this.unit_physics = true;
	}
	public void actFinance(){
		this.unit_finance = true;
	}
	public void actTime(){
		this.unit_time = true;
	}
	public void actCar(){
		this.unit_car = true;
	}
	
	// getter
	public boolean getMath(){
		return unit_math;
	}
	public boolean getPhysics(){
		return unit_physics;
	}
	public boolean getFinance(){
		return unit_finance;
	}
	public boolean getTime(){
		return unit_time;
	}
	public boolean getCar(){
		return unit_car;
	}
}
