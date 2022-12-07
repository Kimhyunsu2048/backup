package day15;

import java.text.*;

public class Ex02 {

	public static void main(String[] args) {
		/*
		double[] limits = {60,70,80,90};
		String[] patterns= {"D", "C", "B", "A"};
		//D 60이하, 60~69
		//C 70~80
		//B 81~89
		//A 90~
		int[] scores = {100,95, 92, 88, 50, 62};		
		ChoiceFormat cf = new ChoiceFormat(limits, patterns);
		*/
		
									//81~89
		String patterns= "60#D|70#C|80<B|90#A";
		ChoiceFormat cf = new ChoiceFormat(patterns);
		int[] scores = {100, 95, 92, 88, 80, 50, 62};
		
		for(int score : scores) {
			String grade = cf.format(score);
			System.out.println(score+":"+grade);
		}

	}

}
