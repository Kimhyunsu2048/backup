package day13.sub1;

import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person(30,"이름1");
		//toString()
		System.out.println(p1.toString());
		System.out.println(p1); //p1.toString()
		
		String name = "이름!";
		System.out.println(name.toString());
		
		Date date  = new Date();
		System.out.println(date.toString());
		
	}

}
