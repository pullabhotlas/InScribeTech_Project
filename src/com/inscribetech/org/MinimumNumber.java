package com.inscribetech.org;
import java.util.*;

public class MinimumNumber {
	
	public static int nonConstructableChange(int[] coins){
		 
		Arrays.sort(coins);
		int currentChange = 0;
		
		for (int coin : coins){
			if (coin > currentChange + 1){
				
				return currentChange + 1;
				
			} else {currentChange += coin;}
			
		}
		return currentChange + 1;
	 }
	
	public static void main(String[] args) {
		
		int[] coins = {5, 1, 1, 2, 3, 7, 22};
		int result = nonConstructableChange(coins);
		System.out.println(result);
		
	}
			

}
