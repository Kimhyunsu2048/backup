package day09.sub3;

public class Ex01 {
	public static void main(String[] args) {
		//Calculator cal = new Calculator();
		Calculator cal = new SimpleCalculator(); //다형적
		
		SimpleCalculator cal2 = (SimpleCalculator)cal;
		
		int result1 = cal.add(10, 20);
		int result2 = cal.minus(50, 10);
		
		System.out.println(result1 );
		System.out.println(result2);
		
		cal.num = 20;
		System.out.println(cal.num);
		
		cal.print();
		
		
		
	}

}
