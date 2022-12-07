package day12;

public class Ex02 {

	public static void main(String[] args) {
		int num1 =10;
		int num2 = 0;
		
		try {
			int result = num1/num2;
			System.out.println(result);
		}catch(RuntimeException e) {
			// RuntimeException e = new ArithmeticException(...); // 다형성
			// Exception e = new ArithmeticException(...);
			System.out.println("0으로 나눌수 없습니다.");
		}finally {
			System.out.println("항상 실행!");
		}
		
			System.out.println("실행!");
		//컴파일 OK, 실행 OK, 실행중 오류 발생- RuntimeException

	}

}
