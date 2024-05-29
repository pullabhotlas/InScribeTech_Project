package com.inscribetech.org;
import java.util.*;

public class ValidateSubSequence2 {
	
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqPtr = 0;
        for (int num : array) {
            if (seqPtr == sequence.size()) {
                break;
            }
            if (sequence.get(seqPtr) == num) {
                seqPtr++;
            }
        }
        return seqPtr == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(1, 6, -1, 10);
        System.out.println(isValidSubsequence(array, sequence)); // Output: true
    }

}
