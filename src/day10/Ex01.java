package day10;

public class Ex01 {
	
	public static void main(String[] args) {
		SimpleCalculator cal = new SimpleCalculator();
		
		cal.num =20;
		System.out.println(cal.num);
		
		int result = cal.add(10, 20);
		System.out.println(result);
		
		int result1 = cal.minus(30, 20);
		System.out.println(result1);
		
		cal.print();
		
		
	}

}
