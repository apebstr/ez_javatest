package ncs.test09;

public class PlaneTest {

	public static void main(String[] args) {

		// Airplane 과 Cargoplane 객체 생성 
		Plane air = new Airplane("L747", 1000);
		Plane car = new Cargoplane ("C40", 1000);
		
		// 생성된 객체의 정보 출력 
		System.out.printf("%-10s %8s\n", "Plane", "fuelSize");
		System.out.println("--------------------");
		System.out.printf("%-10s %8d\n", air.getPlaneName(), air.getFuelSize());		
		System.out.printf("%-10s %8d\n", car.getPlaneName(), car.getFuelSize());		
				
		// Airplane 과 Cargoplane 객체에 100 씩 운항 
		air.flight(100);
		car.flight(100);
		// 100 운항 후 객체 정보 출력 
		System.out.println("100운항");
		System.out.printf("%-10s %8s\n", "Plane", "fuelSize");
		System.out.println("--------------------");
		System.out.printf("%-10s %8d\n", air.getPlaneName(), air.getFuelSize());		
		System.out.printf("%-10s %8d\n", car.getPlaneName(), car.getFuelSize());
		
		//Airplane 과 Cargoplane 객체에 200 씩 주유
		air.refuel(200);
		car.refuel(200);
		// 200 주유 후 객체 정보 출력
		System.out.println("200 주유");
		System.out.printf("%-10s %8s\n", "Plane", "fuelSize");
		System.out.println("--------------------");
		System.out.printf("%-10s %8d\n", air.getPlaneName(), air.getFuelSize());		
		System.out.printf("%-10s %8d\n", car.getPlaneName(), car.getFuelSize());
		

	}//main

}//class
