// https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
// Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.


import java.util.Arrays;
import java.util.HashMap;

public class prg4 {
    public static void main(String[] args) {
        int arr1[] = {3, 2, 1, 5, 6, 4, 90, 89};
        int arr2[] = {1, 5, 3, 91, 2, 4, 55, 1, 3};

        System.out.println("The union of 2 arrays is: " + Arrays.toString(union(arr1, arr2)));
    }


    // TC - O((m+n)log(m+n))
    // SC - O(m+n)
    public static int[] union(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int a : nums1){
            map.put(a, map.getOrDefault(a, 0)+1);
            
        }

        for(int a : nums2){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        System.out.println(map.size());

        int k = 0;
        int[] arr = new int[map.size()];
        for(int i : map.keySet()){
            arr[k++] = i;
        }
        return arr;
    }
}
