package day15.sub1;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();	
		printDate(cal);
		
		cal.set(2022, 8, 30);
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2021);
		printDate(cal);
		
		cal.add(Calendar.MONTH, 1); //1달 뒤
		printDate(cal);
		
		cal.add(Calendar.MONTH, -9); //9달 전
		printDate(cal);
	}
	
	private static void printDate(Calendar cal) {
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}
}
