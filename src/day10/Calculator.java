package day10;

public abstract class Calculator {
	
	int num = 10;
	
	// 하위클래스가 반드시 구현할 메서드
	// 규약, 가이드라인, 설계
	public abstract int add(int num1, int num2);
	public abstract int minus(int num1, int num2);
	
	public void print() {
		System.out.println("출력!");
	}

}
