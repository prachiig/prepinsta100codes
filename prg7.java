// https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1

// Given an array arr[] denoting heights of N towers and a positive integer K.
// For each tower, you must perform exactly one of the following operations exactly once.

// Increase the height of the tower by K
// Decrease the height of the tower by K
// Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

// Note: It is compulsory to increase or decrease the height by K for each tower. 
// After the operation, the resultant array should not contain any negative integers.
// Input: k = 3, arr[] = {3, 9, 12, 16, 20}
// Output: 11
// Explanation: The array can be modified as {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.The difference between the largest and the smallest is 17-6 = 11. 

import java.util.*;


public class prg7 {
    public static void main(String[] args) {
        int arr[] = {3, 9, 12, 16, 20};
        int k = 3;
        System.out.println("The maximum sum of sub array by iteration is: " + getMinDiff(arr, k));
    }


    // TC - O(N)    - 1 iteration
    // SC - O(1)    - no extra space
    public static int getMinDiff(int[] arr, int k){
        int n = arr.length;
        Arrays.sort(arr);
        int res = arr[n-1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - k < 0)
                continue;
            
            int min = Math.min(arr[0]+k , arr[i]-k);
            int max = Math.max(arr[i-1]+k , arr[n-1]-k);
            res = Math.min(res, max-min);
        }
        return res;
    }
}
