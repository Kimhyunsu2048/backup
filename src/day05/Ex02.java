package day05;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int num1=10;
		int num2=20;
		
		int result = calc.add(num1, num2);
		
		System.out.println(result);
		
		int result2 = calc.add(10,20,30);
		System.out.println(result2);
		
		
		calc.minus(30, 20);
		
		calc.print();
		
		
	}
}
