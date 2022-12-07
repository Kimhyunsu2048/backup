package day18;

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("사과", "오렌지", "바나나");
		System.out.println(fruits);  //[사과, 오렌지, 바나나]
		
		int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(Arrays.toString(nums)); // [[I@1c4af82c, [I@379619aa, [I@cac736f]
		System.out.println(Arrays.deepToString(nums)); //[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
		
		int[] nums2 = new int[10];
		Arrays.fill(nums2, 1);
		System.out.println(Arrays.toString(nums2)); //[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]	

	}
}
