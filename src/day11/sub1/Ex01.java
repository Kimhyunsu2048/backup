package day11.sub1;

public class Ex01 {
	public static void main(String[] args) {
		Outer out = new Outer();
		OrderProduct orderProduct = out.method(10,20); // 함수실행 종료, int num1, int num2 -> 제거
		orderProduct.order();
		
	}

}
