package ncs.test09;

public class Cargoplane extends Plane {
	
	public Cargoplane() {
		// TODO Auto-generated constructor stub
	}
		
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		int data = distance/10;
		setFuelSize(getFuelSize()-(50*data));
	}

}//end of class Cargoplane
