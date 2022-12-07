package day03;

import java.util.Scanner;

public class Work3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇층으로 모실까요?");
		int floor = sc.nextInt();
		
		switch(floor) {
			case 1:
				System.out.println("1층 약국");
				break;
			case 2:
				System.out.println("2층 정형외과");	
				break;
			case 3:
				System.out.println("3층 피부과");
				break;
			case 4:
				System.out.println("4층 치과");
				break;
			default:
				System.out.println("5층 헬스클럽입니다.");
				break;
		}
		
			
		
	}
}
