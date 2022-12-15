package ncs.test03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		
		//생일
		Calendar birth = Calendar.getInstance();
		int year = 1987;
		int month = 5;
		int day = 27;
		birth.set(year, month-1, day);
		
		//오늘 날짜
		Calendar toDay = Calendar.getInstance();
		int toY = 2016;
		int toM = 4;
		int toD = 18;
		toDay.set(toY, toM-1, toD);
		
		//나이계산
		long chkBirth = birth.getTimeInMillis();
		long chkToday = toDay.getTimeInMillis();
		long age = (chkToday - chkBirth)/86400000/365;
		
		//출력
		SimpleDateFormat fmB = new SimpleDateFormat("YYYY년 MMM dd일 EEEE ");
		System.out.println(fmB.format(chkBirth));
		SimpleDateFormat fmT = new SimpleDateFormat("YYYY년 MMM dd일");
		System.out.println(fmT.format(chkToday));
		System.out.printf("나이 : %d세", age+1);
		
	}//main

}//class
