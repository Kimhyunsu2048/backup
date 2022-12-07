package day15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Ex01 {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		
		String pattern = "yyyy-MM-dd HH:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
		
		//parse
		String pattern2 = "yyyy-MM-dd HH:mm:ss";
		String dateStr2 = "2022-10-15 12:00:30";
		SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
		Date date2 = sdf2.parse(dateStr2);
		System.out.println(date2);		
	}
}
