package day07.sub;

public class Company {
	
	private static Company instance = new Company();
	
	private Company(){}
	
	public static Company getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println("출력!");
	}

}
