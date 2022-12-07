package day06;

import day05.sub.Korean;

public class Ex01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.grade = 3;
		s1.schoolId = 1000;
		s1.name = "학생1";		
		s1.studentInfo();
		System.out.println("s1= "+System.identityHashCode(s1));
		s1 = null;//주소값이 null, 객체와 연결 X
		
		s1.studentInfo();
		
		
		Student s2 = new Student();
		s2.grade = 2;
		s2.schoolId = 1001;
		s2.name = "학생2";
		s2.studentInfo();
		System.out.println("s2= "+System.identityHashCode(s2));
		
		Student s3 = s2;
		s3.grade =1;
		s3.schoolId =1002;
		s3.name = "학생3";
		s3.studentInfo();
		System.out.println("s3= "+System.identityHashCode(s3));
		
		//boolean isStudentObject = s2 instanceof Student;
		//boolean isStudentObject = s2 instanceof Korean;
		if(s2 instanceof Student) {
			System.out.println("Student 클래스로부터 만들어진 객체!");
		}
		
		//System.out.println(isStudentObject);

		
	}
}
