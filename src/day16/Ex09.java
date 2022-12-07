package day16;

import java.time.LocalDate;
import java.time.Period;

public class Ex09 {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now().minusYears(1).minusMonths(2).minusDays(20);
		LocalDate ld2 = LocalDate.now();
		
		Period pe = Period.between(ld1, ld2);
		System.out.println(pe);
		int year = pe.getYears(); // 1년
		int month = pe.getMonths();  //2개월
		int day = pe.getDays();  // 20일
		System.out.println(year+"년"+month+"개월"+day+"일");

	}

}
