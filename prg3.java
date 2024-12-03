// https://leetcode.com/problems/intersection-of-two-arrays/submissions/1467487592/
// Given two integer arrays nums1 and nums2, return an array of their 
// intersection. Each element in the result must be unique and you may return the result in any order.
// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]


import java.util.*;

public class prg3 {
    public static void main(String[] args) {
        int arr1[] = {3, 2, 1, 5, 6, 4};
        int arr2[] = {1, 5, 3, 91};

        System.out.println("The intersection of 2 arrays is: " + Arrays.toString(intersection(arr1, arr2)));
    }

    // TC - O(max(N1, N2))
    // SC - O(N)
    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> hset = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int a : nums1)
            hset.add(a);
        for(int a : nums2){
            if(hset.contains(a)){
                list.add(a);
                // remove the set elements to remove duplicacy else 2 times same no. will be printed(imp step)
                hset.remove(a);
            }
        }

        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
