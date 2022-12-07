package day17;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		for(int i=0;i<10;i++) {
			names.add("이름"+(i+1));
		}
		printNames(names);
	}
	
	private static void printNames(List<String> names) {
		ListIterator<String> ir = names.listIterator();
		while(ir.hasNext()) {
			String name = ir.next();
			System.out.println(name);
		}
		
		while(ir.hasPrevious()) {
			String name = ir.previous();
			System.out.println(name);
		}
		
	}

}
