package day15;

import java.util.*;
import java.text.*;
import java.io.*;

public class Ex04 {

	public static void main(String[] args) throws IOException, ParseException {
		String pattern = "이름:{0}, 전화번호:{1}";
		
		MessageFormat mf = new MessageFormat(pattern);
		Scanner sc = new Scanner(new File("persons.txt"));
		
		while(sc.hasNext()) {
			String str = sc.nextLine();
			Object[] data = mf.parse(str);
			System.out.println(Arrays.toString(data));
			String name = (String)data[0];
			String tel = (String)data[1];
		}
	}
}
