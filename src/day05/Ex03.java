package day05;

public class Ex03 {
	public static void main(String[] args) {
		Student s1 = new Student(); // 생성자
		s1.name = "학생1";
		s1.grade = 3;
		s1.schoolid = 1000;		
		s1.studentInfo();
		
		System.out.println("s1= "+System.identityHashCode(s1));
		
		Student s2 = new Student();
		s2.name = "학생2";
		
		
		s2.grade = 2;
		s2.schoolid = 1001;
		s2.studentInfo();
		System.out.println("s2= "+System.identityHashCode(s2));
		
		Student s3 = s2;
		s3.name = "학생3";
		s3.grade = 1;
		s3.schoolid =1002;
		s3.studentInfo();
		
		System.out.println("s3= "+System.identityHashCode(s3));
		
		
	}
}
