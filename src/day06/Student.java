package day06;

public class Student {
	int grade;
	int schoolId;
	String name;
	
	public Student() {}
	
	public Student(int _grade, String _name) {		
		grade = _grade;
		name = _name;
	}
	
	public Student(int _grade, int _schoolId, String _name) {		
		grade = _grade;
		schoolId = _schoolId;
		name = _name;
	}
	
	public void studentInfo() {
		System.out.println("학년= "+grade+", 학번= "+schoolId+", 이름= "+name);
	}
	
	

}
