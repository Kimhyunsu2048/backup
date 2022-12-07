package day07.sub;

public class Student {
	int grade;
	static int schoolId;
	String name;
	static {
		// 클래스가 로드 -> 실행, static 변수 초기화
	}
	
	
	void print() {
		System.out.println("grade = "+ grade+", shcoolId = "+schoolId+", name = "+name);
		
	}
	
	static void print2() {
		// 정적 메서드, 정적 변수 O
		// 정적 메서드에서는 인스턴스 변수X, 인스턴스 메서드X
		System.out.println("출력!");
	}

}
