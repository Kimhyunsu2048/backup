package day02;

public class Ex01 {
	public static void main(String[] args) {
		byte num1 = 100;
		int num2 = num1;
		
		float num3 = 3.14F;
		double num4 = num3;
		
		int num5 = 1000000;
		byte num6 = (byte)num5; // 명시적형변환
		System.out.println(num6);
	}
}
