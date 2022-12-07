package day12;

import java.io.*;

public class Ex01 {
	public static void main(String[] args) {
		
		//FileNotFoundException,,.class 파일X -> 실행자체X
		try {
			FileInputStream fis = new FileInputStream("aaa.txt"); //실제 파일X -> 예외 객체를 던지기
			System.out.println("실행되는 부분!");			
			
		}catch(Throwable e) { // FileNotFoundException e = new FileNotFoundException(...);
			// IOException e = new FileNotFoundException(...);  // 다형성
			// Exception e = new FileNotFoundException(...);
			// Throwable e = new FileNotFoundException(...);
			
			System.out.println("예외 발생!");
		}
			System.out.println("실행!");		
		
	}

}
