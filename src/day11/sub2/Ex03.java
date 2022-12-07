package day11.sub2;

import java.io.*;

public class Ex03 {
	public static void main(String[] args) {
		try {
		loadClass("test");
		}catch(FileNotFoundException| ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("loadClass 성공 후에 반드시 실행되는 기능!");
				
		
	}
	
	public static void loadClass(String className) throws FileNotFoundException, ClassNotFoundException { 
		//컴파일시 체크되는 예외만 전가시 throws 명시
		
		Class.forName(className);		
		FileInputStream fis = new FileInputStream("1111.txt");
		
	}

}
