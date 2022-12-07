package day11;

public class Outer3 {
	
	Runnable run1 = new Runnable() {
		public void run() {
			System.out.println("출력!!");
		}
	};
	
	Runnable method(int num1, int num2) {
		
		return /*runnable =*/new Runnable() { // 익명 내부 클래스
			public void run() {
				//System.out.println("출력!");
				//num1 = 30; //상수 - 수정X final
				//num2 = 40; //상수 - 수정X final
				
				int result = num1 + num2; // 지역변수 -> 상수(연산위해 제거X)
				System.out.println(result);
			}
		};
		
		
	}

}
