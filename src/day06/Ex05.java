package day06;

public class Ex05 {
	public static void main(String[] args) {
		Schedule sc = new Schedule();
//		sc.year = 2022;
//		sc.month = 2;
//		sc.day = 31;
		
		sc.setYear(2022);
		sc.setMonth(2);
		sc.setDay(31);
		
		sc.showDate();
		
		int month = sc.getMonth();
		System.out.println(month);
		
		
		
		
	}
}
