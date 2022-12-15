package ncs.test07;

public class Student extends Human {
	
	private String number;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return String.format("%5s %4d %4d %4d %6s %s",
				getName(), getAge(), getHeight(), getWeight(), getNumber(), getMajor());
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}	

	
}// end of class Student
