package day16;

import java.time.*;

public class Ex07 {

	public static void main(String[] args) {
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalDateTime ldt2 = ldt1.plusMonths(24);
		LocalDateTime ldt3 = ldt1.minusDays(100);
		System.out.println(ldt1.isAfter(ldt3));
		System.out.println(ldt1.isBefore(ldt2));
		
	}
}
