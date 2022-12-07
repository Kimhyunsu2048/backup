package day07;

public class Student {
	int grade;
	static int schoolId;
	String name;
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", schoolId=" + schoolId + ", name=" + name + "]";
	}
	
	public static void print() {
		// 활성화 -> 처음 로딩, 객체보다 먼저
		/*
		String str = "Student [grade=" + grade + ", schoolId=" + schoolId + ", name=" + name + "]";
		System.out.println("출력!");
		*/
		Student s1 = new Student();
		s1.name = "학생1";
		s1.grade = 3;
		Student.schoolId = 1000;
		System.out.println(s1);
		
	}
	
	public void print2() {
		System.out.println("출력2");
		print(); //정적 메서드 호출 가능
		schoolId = 1000;
	}
	
	

}
