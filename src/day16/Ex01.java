package day16;

import java.time.*;

public class Ex01 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
//		System.out.println(ld);
//		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.of(2022,11,10,12,30,20);
		System.out.println(ldt); //2022-11-10T12:30:20 (T : ISO 표준시간 기준)
		
		LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
		System.out.println(ldt2);
				

	}

}
