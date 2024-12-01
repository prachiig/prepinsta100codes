// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
// Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.
// Can you solve it without sorting?
// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5


import java.util.*;

    
public class prg2 {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println("The kth largest element in the array is: " + findKthLargest(arr, k));
        System.out.println("The kth smallest element in the array is: " + findKthSmallest(arr, k));
    }


    // TC - O(k + (n-k)*log k)
    // SC - O(k)
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        int z = k - 1;
        while(z > 0){
            pq.remove();
            z--;
        }
        return pq.peek();
    }

    // TC - O(k + (n-k)*log k)
    // SC - O(k)
    public static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
        }
        int z = k - 1;
        while(z > 0){
            pq.remove();
            z--;
        }
        return pq.peek();
    }
}
