package day13.sub2;

public class Ex05 {
	public static void main(String[] args) {
//		Integer num1 = new Integer(10);
//		Integer num2 = new Integer(10);
//		System.out.println(System.identityHashCode(num1));
//		System.out.println(System.identityHashCode(num2));
//		int num3 = num1+num2;
//		System.out.println(num3);
		
		
		//double num2 = num1.doubleValue();
		//System.out.println(num2);
		
		Integer num1 = Integer.valueOf(10);
		Integer num2 = Integer.valueOf(10);
//		System.out.println(System.identityHashCode(num1));
//		System.out.println(System.identityHashCode(num2));
		
		int num3 = num1; // Integer num1  //래퍼클래스 -> 기본자료형 자동 변환(언 박싱)
		// int num3 = num1.intValue();
		System.out.println(num3);
		
		int num4 = 40;
		Integer num5 = num4; //Integer num5 = Integer.valueOf(num4);
		// 기본 자료형 -> 래퍼 클래스 -> 오토박싱
		
		

		
	}

}
