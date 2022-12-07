package day14.sub2;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		double num = Math.random()*5; //0~ <5 미만
		System.out.println((int)num); // 0~5미만
		
		//java.util.Random
		Random rand = new Random();
		System.out.println(rand.nextInt()); // int범위 내에서 random 됨

	}

}
