package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Calculator s = new Calculator();
		int sum = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("1~5까지의 정수를 입력하시오 : ");
		int data1 = sc.nextInt();
		sum += s.getSum(data1);
		int data2 = sc.nextInt();
		sum +=s.getSum(data2);
		int data3 = sc.nextInt();
		sum +=s.getSum(data3);
		int data4 = sc.nextInt();
		sum +=s.getSum(data4);
		int data5 = sc.nextInt();
		sum +=s.getSum(data5);
		
		System.out.println("결과값 : "+sum);		

	}//main

}//class
