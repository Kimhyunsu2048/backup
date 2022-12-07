package day16;

import java.time.*;
import static java.time.temporal.ChronoUnit.*;

public class Ex06 {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		//LocalDateTime ldt2 = ldt.minus(100,DAYS);
		//LocalDateTime ldt2 = ldt.plusDays(100);
		LocalDateTime ldt2 = ldt.minusDays(100);
		System.out.println(ldt2);
	}
}
