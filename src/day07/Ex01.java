package day07;

public class Ex01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.grade = 3;
		s1.schoolId = 1000;
		s1.name = "학생1";
		
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		Student s2 = new Student();
		System.out.println(System.identityHashCode(s2));
		
		Student s3 = s1;
		System.out.println(System.identityHashCode(s3));
		s3.grade=2;
		System.out.println("s3= "+s3);
		System.out.println("s1= "+s1);
		s2=null;
		System.out.println("s2= "+s2);
		
		
		
	}

}
