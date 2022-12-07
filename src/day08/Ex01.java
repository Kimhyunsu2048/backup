package day08;

public class Ex01 {
	public static void main(String[] args) {
		//B b = new B();
		C c = new C(); // int numC, numB, numA
		B b = c;	// int numB, numA
		A a = c;	// int numA
		// 다형성
		
		// 하위클래스 -> 상위클래스
		
		C cc = (C)a;  // 상위 -> 하위클래스(명시적 형변환)
		
	}

}
