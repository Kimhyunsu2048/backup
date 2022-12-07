package day11.sub1;

public class Ex02 {
	public static void main(String[] args) {
		Animal animal = new Animal() {
			public void move() {
				System.out.println("move!");
			}
		};
		
		animal.move();
		
		
		A a = new A() {
			public void method() {
				System.out.println("수정");
			}
		};
		
		a.method();
		
	}

}
