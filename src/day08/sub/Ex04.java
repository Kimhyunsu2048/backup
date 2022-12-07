package day08.sub;

public class Ex04 {
	public static void main(String[] args) {
		Animal[] animals = new Animal[4];		
		
		//Animal human = new Human();
		//Animal fish = new Fish();
		
		animals[0] = new Human(); // Animal animals[0] = new Human();
		animals[1] = new Fish();  // Animal animals[1] = new Fish();
		animals[2] = new Tiger();
		animals[3] = new Bird();
		
		
		for(Animal animal : animals) {
			animal.move();
		}
		
	}

}
