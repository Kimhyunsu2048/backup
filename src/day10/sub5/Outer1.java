package day10.sub5;

public class Outer1 {
	int numOuter = 20; //인스턴스 생성 후 사용가능
	
	class Inner{ //인스턴스 내부 클래스 -> 인스턴스 변수, 메서드
		int numInner = 10;
		static int num = 20;
		void print() {
			staticPrint();
			System.out.println("내부 클래스!");
			System.out.println("numOuter="+numOuter);
		}
		
		static void staticInnerPrint() { // jdk15까지 -> 오류 발생, jdk16부터 -> 사용가능
			
		}
		
	}
	
	static void staticPrint() {
		System.out.println("출력!");
	}

}
