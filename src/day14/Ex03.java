package day14;

public class Ex03 {

	public static void main(String[] args) {
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(20);
		
		int num6 = num1+num2; // num1.intValue() + num2.intValue() // 언박싱
		int num7 = 30+num2; // 30+num2.intValue() // 언박싱
		
		int num3 = num2; // Integer num2.intValue(); Integer -> int // 언박싱
		int num5 = 30;
		Integer num4 = num5; // Integer.valueOf(num5); //오토 박싱
		
		//byte num2 = num1.byteValue();

	}

}
