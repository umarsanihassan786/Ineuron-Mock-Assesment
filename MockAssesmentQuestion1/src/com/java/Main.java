package com.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static List<Integer> moveZeroes(int[] nums) {
        int pos = 0; // position to insert non-zero elements
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, move it to the pos index
                nums[pos] = nums[i];
                pos++;
            }
        }
        
        // Fill the remaining elements with zeros
        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
		return null;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; // Example input

        List<Integer> duplicates = moveZeroes(nums);

        System.out.println("Duplicate integers: " + duplicates);
    }
}
