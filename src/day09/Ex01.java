package day09;

public class Ex01 {
	public static void main(String[] args) {
		C c = new C();
		
		B b = c;
		A a = c;
		A ad = new D();
		
		// 다형성
		
		//C ac = a;
		if(ad instanceof C) {
			C acd = (C)ad;
		}
		
		if(a instanceof D) {
			C ac = (C)a;
		}
		
	}

}
