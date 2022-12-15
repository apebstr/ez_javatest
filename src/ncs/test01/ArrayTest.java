package ncs.test01;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, 
				{14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
		
		double sum;
		double avg;
		double totalSum = 0;
		double totalAvg = 0;
	
		for(int i =0; i<array.length; i++) {
			
			sum = 0;
			avg = 0;
			
			for(int j=0; j<array[0].length; j++) {
				
				sum += array[i][j];
								
			}//for j
			avg = sum/array[i].length;
			
			totalSum += sum;
			totalAvg += avg;
					
		}//for i		
		
		totalAvg = totalAvg/array.length;
		
		System.out.printf("합계 : %.2f\n",totalSum);
		System.out.printf("합계 : %.2f",totalAvg);
		
	}//main

}//class
