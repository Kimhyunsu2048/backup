package day03;

public class Ex04 {
	public static void main(String[] args) {
		//int floor = 10;
		String floor = "2층";
		switch(floor) {
		  case "1층":
			  System.out.println("1층!");
			  break;
		  case "2층":
			  System.out.println("2층!");
			  break;
		  case "3층":
			  System.out.println("3층!");
			  break;
		  case "4층":
			  System.out.println("4층!");
			  break;
		  case "5층":
			  System.out.println("5층!");
			  break;
		  default:
			  System.out.println("없는 층!");
		}
	}
}
