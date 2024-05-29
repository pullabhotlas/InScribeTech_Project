package com.inscribetech.org;

public class ValidateSubSequence {
	
public static boolean validateSubsequence(int[] array, int[] sequence){
		
		int arrIdx = 0;
		int seqIdx = 0;
		
		while (arrIdx < array.length && seqIdx < sequence.length) {
			
			if (array[arrIdx] == sequence[seqIdx]) {
				
				seqIdx++;
			}
			
			arrIdx++;
			
		}
		
		return seqIdx == sequence.length;
	}
	
	public static void main(String[] args) {
		
		int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
		
		int[] sequence1 = {1, 6, -1, 10};
		System.out.println(validateSubsequence(array, sequence1));
		
		int[] sequence2 = {1, 6, -1, 11};
		System.out.println(validateSubsequence(array, sequence2));
		
		int[] sequence3 = {90, 1, 6, -1};
		System.out.println(validateSubsequence(array, sequence3));
		
		int[] sequence4 = {};
		System.out.println(validateSubsequence(array, sequence4)); 
		
	}


}
