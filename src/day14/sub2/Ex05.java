package day14.sub2;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		
		String fruits = "사과#배#귤+바나나#멜론";
		
		StringTokenizer st = new StringTokenizer(fruits,"#+");
		
		while(st.hasMoreTokens()) {
			String fruit = st.nextToken();
			System.out.println(fruit);
		}
	}
}