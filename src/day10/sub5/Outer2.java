package day10.sub5;

public class Outer2 {
	
	int numOuter = 20;
	
	static void print() {
		
	}
	
	static class Inner{
		int numInner =10;
		void print() {
			Outer2.print();
			//numOuter =30;
			System.out.println("내부 클래스!");
		}
	}
	
	

}
