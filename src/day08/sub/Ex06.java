package day08.sub;

public class Ex06 {
	public static void main(String[] args) {
		Animal human = new Human();
		Animal tiger = new Tiger();
		
		human.move();
		tiger.move();
		
		
		if(human instanceof Human) {
			Human human2 = (Human)human;
			human2.reading();
		}
		
		if(tiger instanceof Tiger) {
			Tiger tiger2 = (Tiger)tiger;
			tiger2.hunting();
		}
		
	}

}
