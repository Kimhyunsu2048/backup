package day13.sub1;

public class Ex05 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println("str1 hash="+str1.hashCode());
		System.out.println("str2 hash="+str2.hashCode());
		

	}

}
