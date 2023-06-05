package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static int firstUniqChar(String s) {
        // Create a frequency map to store the count of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Iterate through the string and update the frequency map
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Iterate through the string again to find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // No non-repeating character found, return -1
        return -1;
    }

    public static void main(String[] args) {
    	System.out.println(firstUniqChar("leetcode"));       // Output: 0
        System.out.println(firstUniqChar("loveleetcode"));   // Output: 2
        System.out.println(firstUniqChar("aabb"));   
    }
}
