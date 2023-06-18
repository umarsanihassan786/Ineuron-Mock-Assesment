package com.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                left = mid + 1;
                result = mid; // Store the current value as a potential result
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main solution = new Main();
        System.out.println(solution.mySqrt(4)); // Output: 2
        System.out.println(solution.mySqrt(8)); // Output: 2
    }
}
