package day14.sub3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strDate = sdf.format(date);
		System.out.println(strDate);
	}
}
