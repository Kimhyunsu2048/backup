package day05;

public class Student {
	
	
	int grade; //학년
	int schoolid; //학번
	String name; //이름
	
	public Student() {
		
	}
	
	public Student(int _grade, String _name) {
		grade = _grade;
		name = _name;
	}
	
	public Student(int _grade, int _schoolid, String _name) {
		grade = _grade;
		schoolid = _schoolid;
		name = _name;		
		
	}
	
	public void studentInfo() {
		System.out.println("학년="+grade+", 학번="+schoolid+", 이름="+name);
	}
	
}
