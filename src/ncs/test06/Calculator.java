package ncs.test06;

public class Calculator {

	int data;

	public double getSum(int data) {

		int sum=0;
		if(data >=2 && data<=5) {
			sum += data;
			return sum;
		}else
			return "에러";
	}//getSum()

	
}//end of class Calculator
