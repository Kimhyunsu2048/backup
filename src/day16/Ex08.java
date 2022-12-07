package day16;

import java.time.*;
import java.util.Date;

public class Ex08 {

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		System.out.println("seconds:"+now.getEpochSecond());	//초 단위
		System.out.println("milli:"+now.toEpochMilli());	//천분의 일초 단위
		
		Date date = Date.from(now);
		System.out.println(date);

	}
}
