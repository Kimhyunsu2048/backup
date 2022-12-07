package day13.sub2;

public class Ex03 {

	public static void main(String[] args) {
		String str = "I love";
		System.out.println(System.identityHashCode(str));
		
		str += " java";
		System.out.println(System.identityHashCode(str));
		str += " A ";
		System.out.println(System.identityHashCode(str));
		str += "BCD";
		System.out.println(System.identityHashCode(str));
		
		System.out.println(str);
		
		
		

	}

}
