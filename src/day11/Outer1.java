package day11;

public class Outer1 {
	
	int num;
	
	class Inner{  //인스턴스 내부 클래스: 인스턴스 변수, 인스턴스 메서드 비슷
		static int num; // JDK15 이하 오류, JDK16 이후 오류x
		void print() {
			System.out.println("출력!");
		}		
	}
	
	static void staticPrint() { // JDK15 이하 오류, JDK16 이후 오류x
		
	}

}
