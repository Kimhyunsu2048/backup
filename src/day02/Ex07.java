package day02;

public class Ex07 {
	public static void main(String[] args) {
		int num1 = 10;
//		num1++; // num = num+1;
//		num1++; // num = num+1;
		
//		++num1; // num = num+1;
//		++num1; // num = num+1;
		
		int num2 = num1++; //1.대입(num2 = num1), 2.연산(num1 = num1+1)
		//int num2 = ++num1; // 1.연산(num1 = num1+1), 2.대입(num2 = num1)
		
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		
	}
}
