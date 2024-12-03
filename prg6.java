// https://leetcode.com/problems/maximum-subarray/description/
// Given an integer array nums, find the subarray with the largest sum, and return its sum.
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

import java.util.Arrays;

public class prg6{
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The maximum sum of sub array by iteration is: " + maxSubArray(arr));
        System.out.println("The maximum sum of sub array by kadane algorithm is: " + maxSubArray_kadane(arr));
    }

    // TC - O(N*N)   - 2 loop iteration
    // SC - O(1)     - no extra space
    public static int maxSubArray(int[] arr){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currsum = 0;
            for (int j = i; j < arr.length; j++) {
                currsum += arr[j];
                res = Math.max(res, currsum);
            }            
        }
        return res;
    }
    // TC - O(N)   - 1 loop iteration
    // SC - O(1)   - no extra space
    public static int maxSubArray_kadane(int[] arr){
        int res = arr[0];
        int maxend = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxend = Math.max(maxend + arr[i], arr[i]);
            res = Math.max(res, maxend);
        }
        return res;
    }
}