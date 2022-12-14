package day15.sub1;

import java.util.Calendar;
import static java.util.Calendar.*;

public class Ex01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//set, get

		int year = cal.get(YEAR);
		int month = cal.get(MONTH); //0 ~ 11
		int day = cal.get(DAY_OF_MONTH);
		
		System.out.println("year= "+year+", month= "+(month+1)+", day= "+day);
		
		int hour = cal.get(HOUR_OF_DAY); //HOUR: 0~11시 , HOUR_OF_DAY: 0~23시
		int min = cal.get(MINUTE);
		int sec = cal.get(SECOND);
		System.out.println("hour= "+hour+", min= "+min+", sec= "+sec);
		
		int yoil = cal.get(DAY_OF_WEEK);
		System.out.println("yoil= "+yoil); // 1(일요일)~7(토요일)
		String[] yoils = {"","일","월","화","수","목","금","토"};
		System.out.println("요일= "+yoils[yoil]);	
	}
}
