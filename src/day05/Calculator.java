package day05;

public class Calculator {
	
	public int add(int num1, int num2) {
		int result = num1+num2;
		
		return result; // 반환값, 함수 실행 종료 // num1, num2, result -> 지역변수
	}
	
	public int add(int num1, int num2, int num3) {
		int result = num1+num2+num3;
		
		return result;
	}
	
	
	public int func(int x) {
		int y = x*2+1;
		
		return y;
	}
	
	public void minus(int num1, int num2) {
		
		int result = num1-num2;
		
		System.out.println(result);
	}
	
	public void print() {
		System.out.println("출력!");
	}
	
}
