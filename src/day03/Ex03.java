package day03;

public class Ex03 {
	public static void main(String[] args) {
		//10이상 20이하, 짝수인 수
		int num = 15;
		if(num>=10 && num<=20 &&num%2 == 0) {
			System.out.println("OK");
		}else {
			System.out.println("Not OK");
		}
	}
}
