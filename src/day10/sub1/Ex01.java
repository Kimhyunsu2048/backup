package day10.sub1;

public class Ex01 {
	public static void main(String[] args) {
		
		SimpleCalculator cal = new SimpleCalculator();
		int result = cal.add(20, 30);
		System.out.println(result);
		
		int result2 = cal.minus(30, 10);
		System.out.println(result2);
		
		int result3 = Calculator.times(10, 10);
		System.out.println(result3);

		
	}

}
