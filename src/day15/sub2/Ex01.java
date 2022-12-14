package day15.sub2;

import java.time.*;

public class Ex01 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2022, 11, 20);
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.of(20, 45, 30);
		System.out.println(time2);
		
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1);
	}
}
