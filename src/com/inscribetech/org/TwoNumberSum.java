package com.inscribetech.org;
import java.util.*;

public class TwoNumberSum {
	
	public class TestClass4{

		public static int[] twoNumberSum(int[] array, int targetSum) {
	        HashMap<Integer, Boolean> nums = new HashMap<>();
	        
	        for (int num : array) {
	            int potentialMatch = targetSum - num;
	            if (nums.containsKey(potentialMatch)) {
	                return new int[] {potentialMatch, num};
	            } else {
	                nums.put(num, true);
	                System.out.println(nums);
	            }
	        }
	        return new int[0];
	    }

	    public static void main(String[] args) {
	        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
	        int targetSum = 90;
	        int[] result = twoNumberSum(array, targetSum);
	        System.out.println(java.util.Arrays.toString(result));
	   }

	}
}
