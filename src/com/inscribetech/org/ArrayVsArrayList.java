package com.inscribetech.org;

import java.util.Arrays;

public class ArrayVsArrayList {
//	public static float[] arraysVsArrayList(float[] floats){
//	
//		float decimals = floats.length;
//		decimals = new floats[4];
//		
//		
//	}
//	return floats;
//	
//	
//	public static void main(String[] args) {
//		
//		
//	}
	
//	public static void main(String[] args) {
//		
//		int[] numbers = {10, 20, 30, 40, 50};
//		System.out.println(numbers);
//		for (int i=0; i<numbers.length; i++) {
//			
//			System.out.println(numbers[i]);
//			
//		}
//	
//		
//	}
	
//	public static void main(String[] args) {
//		
//		char[] chars = {'a', 'b','c', 'd'};
//		System.out.println(chars);
//		
//		int[] nums = {1, 2, 3, 4};
//		System.out.println(nums);
//		
//		
//	}
	
//	public static int[] getIntegers() {
//		
//		int[] nums = {5,2,4,3,1};
//		
//		Arrays.sort(nums);
//		return nums;
//		
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		int[] nums = getIntegers();
//		
//		for (int i=0; i<nums.length; i++) {
//			
//			System.out.println(nums[i]);
//			
//			}
//			
//		}
	
	
	public static void main(String[] args) {
		
		int nums[][] = new int[3][4];
		
		for (int i=0; i<3; i++) {
			
			for (int j=0; j<4; j++) {
				
				nums[i][j] = (int)(Math.random()*10);
				System.out.print(nums[i][j] + " ");
				
			}
			
		}
		System.out.println(" ");
		System.out.println("--------------------");
		
		
		for (int i=0; i<3; i++) {
			
			for (int j=0; j<4; j++) {
				
				System.out.print(nums[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
	}
	
}
