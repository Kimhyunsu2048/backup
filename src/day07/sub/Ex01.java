package day07.sub;

public class Ex01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.grade = 3;
		s1.schoolId = 1000;
		s1.name = "이름1";
		s1.print();
		
		Student s2 = new Student();
		s2.grade = 2;
		s2.schoolId = 1001;
		s2.name = "이름2";
		s2.print();
		s1.print();
		
		
		
	}

}
