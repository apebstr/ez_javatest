package ncs.test09;

public class Airplane extends Plane{
	
	public Airplane() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		int data = distance/10;
		setFuelSize(getFuelSize()-(30*data));
	}

}//end of class Airplane
