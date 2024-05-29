package com.inscribetech.org;
import java.util.*;

public class SortedSquares {
	
public static int[] sortedSquares(int[] array) {
		
		int[] sortedSquares = new int[array.length];
		
		for (int i=0; i<array.length; i++) {
			
			int value = array[i];
			sortedSquares[i] = value * value;
			
		}
		
		Arrays.sort(sortedSquares);
		return sortedSquares;
	}
	
	public static void main(String[] args) {
		
		int[] array = {-4, -1, 0, 3, 10};
		System.out.println(Arrays.toString(sortedSquares(array)));
		
	}

}
