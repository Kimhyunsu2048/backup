package day16;

import java.time.*;

public class Ex02 {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		ZoneId zoneId = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = ldt.atZone(zoneId);
		System.out.println(zdt);
		
		ZoneOffset offset = ZoneOffset.of("+9");
		OffsetDateTime odt = ldt.atOffset(offset);
		System.out.println(odt);

	}

}
