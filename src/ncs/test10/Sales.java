package ncs.test10;

public class Sales extends Employee implements Bonus {
	
	public Sales() {
		// TODO Auto-generated constructor stub
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double tax() {
		return getSalary() *0.13;
	}

	@Override
	public void incentive(int pay) {
		System.out.println(pay+(getSalary()*1.2));
		
	}
}//end of class Sales

