package day18;

import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("이름5");
		names.add("이름3");
		names.add("이름2");
		names.add("이름1");
		names.add("이름4");		
		System.out.println(names); //[이름5, 이름3, 이름2, 이름1, 이름4]
		
		Collections.sort(names);
		System.out.println(names); //[이름1, 이름2, 이름3, 이름4, 이름5]
		
		Comparator<String> comp = new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2)*-1;
			}
		};
		
		Collections.sort(names, comp);
		System.out.println(names); // [이름5, 이름4, 이름3, 이름2, 이름1]
		
	}
}
