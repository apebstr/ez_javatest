package ncs.test11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		//명시한 사용 데이터를 list 에 기록한다.
		Random ran = new Random();
		
		for(int i =0; i<=10; i++ ) {
			list.add((int)(Math.random()*100)+1);
		}
		System.out.println("정렬전 :" +list.toString());
		
		// list 의 데이터를 내림차순 정렬한다.
		list.sort(new Decending());
		
		// display() 메소드를 호출한다.
		display(list);
	}//main 
	
	//display() 메소드를 구현한다
	public static void display(List list) {
		System.out.println("정렬후 :" +list.toString());
	}                                                

}//class
