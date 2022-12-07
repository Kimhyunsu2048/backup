package day08.sub;

public class Ex03 {
	public static void main(String[] args) {
		Human[] humans = new Human[3];
		humans[0] = new Human();
		humans[1] = new Human();
		humans[2] = new Human();
		
		for(Human human:humans) {
			human.move();
		}
		
		Fish[] fishes = new Fish[4];
		fishes[0] = new Fish();
		fishes[1] = new Fish();
		fishes[2] = new Fish();
		fishes[3] = new Fish();
		
		for(int i =0; i<fishes.length;i++) {
			Fish fish = fishes[i];
			fish.move();
		}
		
		
		/*
		Human human = new Human();  // 3명
		human.move();
		
		Fish fish = new Fish(); // 4마리
		fish.move();
		*/
	}

}
