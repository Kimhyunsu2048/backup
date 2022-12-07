package day17;

import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("사과");
		fruits.add("귤");
		fruits.add("배");
		fruits.add("바나나");
		fruits.add("사과");
		
		System.out.println(fruits);
		
		System.out.println("사과는 어디에? "+fruits.indexOf("사과")); 
		System.out.println("배는 어디에? "+fruits.indexOf("배2")); // 배열에 값이 없으면 -1 출력
		System.out.println("사과(역순)는 어디에? "+fruits.lastIndexOf("사과")); 
		
		String fruits2 = "사과,귤,배,바나나,사과";
		System.out.println("사과는 어디에? "+fruits2.indexOf("사과")); 
		System.out.println("배는 어디에? "+fruits2.indexOf("배")); 
		System.out.println("사과(역순)는 어디에? "+fruits.lastIndexOf("사과")); 
		
	}
}
