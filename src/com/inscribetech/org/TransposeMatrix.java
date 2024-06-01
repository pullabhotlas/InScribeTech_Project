package com.inscribetech.org;
import java.util.*;

public class TransposeMatrix {
	
	public static List<List<Integer>> transposeMatrix(List<List<Integer>>matrix){
		
		List<List<Integer>> transposeMatrix = new ArrayList<>();
		int rows = matrix.size();
		int cols = matrix.get(0).size();
		
		for(int col=0; col<cols; col++) {
			List<Integer> newRow = new ArrayList<>();
			for(int row=0; row<rows; row++) {
				newRow.add(matrix.get(row).get(col));
			}
			transposeMatrix.add(newRow);
		}
		
		return transposeMatrix;
		
	}
	public static void main(String[] args) {
		
		List<List<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(List.of(1, 2, 3)));
		matrix.add(new ArrayList<>(List.of(4, 5, 6)));
		matrix.add(new ArrayList<>(List.of(7, 8, 9)));
		
		List<List<Integer>> transposedMatrix = transposeMatrix(matrix);
		for (List<Integer> row : transposedMatrix) {
			
			System.out.println(row);
			
		}
		
	}

}
