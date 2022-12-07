package day18;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		
		Comparator<String> comp = new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2)*-1; // 내림차순으로 변경
			}
		};
		
		TreeSet<String> names = new TreeSet<>(comp);
		
		names.add("이름2");
		names.add("이름3");
		names.add("이름5");
		names.add("이름4");
		names.add("이름1");
		
		System.out.println(names); //[이름1, 이름2, 이름3, 이름4, 이름5]
		
		Comparator<Integer> comp2 = new Comparator<>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2)*-1; // 내림차순으로 변경
			}
		};
		
		TreeSet<Integer> nums = new TreeSet<Integer>(comp2);
		nums.add(20);
		nums.add(21);
		nums.add(19);
		nums.add(25);
		nums.add(15);
		
		System.out.println(nums);
	}
}
