package day12;

import java.io.*;

public class Ex03 {
	public static void main(String[] args) {
		loadClass("aaa.txt","Person");
		
		
	}
	
	public static void loadClass(String fileName, String className) {
		try {
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException
		//Exception e = new FileNotFoundException();  // 다형성
		
		Class cls = Class.forName(className); // ClassNotFoundException
		//Exception e = new ClassNotFoundException(); // 다형성
		
		}catch(ClassNotFoundException | FileNotFoundException e) {
		//	System.out.println("클래스 없음 처리!");
		//}catch(Exception e) {
			//System.out.println("뭔가 오류 발생!");
			//String message = e.getMessage();
			//System.out.println(message);
			//e.printStackTrace();
			
		}
		
		
	}

}

