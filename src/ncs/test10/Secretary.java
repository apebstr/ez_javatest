package ncs.test10;

public class Secretary extends Employee implements Bonus{
	
	public Secretary() {
		// TODO Auto-generated constructor stub
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double tax() {
		return getSalary() *0.1;
	}
	
	@Override
	public void incentive(int pay) {
		Salary = pay+(getSalary()*0.8);
		
	}

}//end of class Secretary
