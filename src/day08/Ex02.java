package day08;

public class Ex02 {
	public static void main(String[] args) {
		A ad = new D();
		
		A ac = new C();
		
		//C acd = (C)ad;
		System.out.println(ad instanceof D);
		System.out.println(ac instanceof C);
		if(ad instanceof C) {
			C acd = (C)ad;
		}
	}

}
