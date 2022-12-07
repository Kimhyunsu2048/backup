package day03;

public class Work4 {
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			
			if(i%2==0) {
				continue;
			}
			
			System.out.println(" ");
			System.out.println("---"+i+"단---");
			for(int j=1;j<=9;j++) {
				System.out.print(i+"x"+j+"="+(i*j)+" ");
			}
		}
		
	}
}
