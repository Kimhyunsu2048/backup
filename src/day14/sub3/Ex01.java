package day14.sub3;

import java.text.DecimalFormat;

public class Ex01 {

	public static void main(String[] args) {
		String pattern = "0,000.0000000";
		//String pattern = "#,###.#######";
		//String pattern = "0000";
		DecimalFormat df = new DecimalFormat(pattern);
		long num = 1000000000L;		  //1,000,000,000.0000000
		//double num = 1234.567890;  //1,234.56789
		//long num = 20;  			//0020
		String strNum1 = df.format(num);
		System.out.println(strNum1);
	}
}
