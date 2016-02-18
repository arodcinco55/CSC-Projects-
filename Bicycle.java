public class Bicycle {
	//the Bicycle class has three fields 
	public int cadence;
	public int gear;
	public int speed; 
	
	//the Bicycle class has one constructor 
	public Bicycle(int startCadence, int startGear, int startSpeed) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed; 
	}
	
	//the Bicycle class had four methods
	public void setCadence (int newValue) {
		cadence = newValue;
	}
	
	public void setGear (int newValue){
		gear = newValue;
	}
	
	public void applyBreak (int decrement){
		speed -= decrement;
	}
	
	public void speedUp (int increment){
		speed += increment;
	}
	
}