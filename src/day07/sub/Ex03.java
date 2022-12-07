package day07.sub;

public class Ex03 {
	public static void main(String[] args) {
		Company c1 = Company.getInstance();
		c1.print();
		
		Company c2 = Company.getInstance();
		c2.print();
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println(c1 == c2);
		
	}

}
