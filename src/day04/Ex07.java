package day04;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
//		int[][] nums = new int[2][3];
//		
//		nums[0][0] = 10;
//		nums[0][1] = 20;
//		nums[1][2] = 30;
		
		//int[][] nums = new int[][] {{10,20,30},{40,50,60}};
		int[][] nums = {{10,20,30},
				         {40,50,60}};
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}
		
		System.out.println(Arrays.deepToString(nums));		
		
	}
}
