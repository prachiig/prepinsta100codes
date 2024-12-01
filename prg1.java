// https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
// Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
// Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
// Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
// Explanation: 0s 1s and 2s are segregated into ascending order.

import java.util.*;

public class prg1 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println("The new sorted array: " + Arrays.toString(sort012(arr)));
    }


    // TC - O(N) - max of 1 loop
    // SC - O(N) - new array space
    public static int[] sort012(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int l = arr.length;
        int k = 0;
        int[] newarr = new int[l];

        for(int i = 0; i < l; i++){
            if(arr[i] == 0) count0++;
            else if(arr[i] == 1)    count1++;
            else if(arr[i] == 2)    count2++;
        }

        System.out.println(count0 +" "+ count1 +" "+ count2);
        System.out.println("------------0-------------");

        while(count0 > 0){
            newarr[k++] = 0;
            count0--;
            System.out.println(k);
        }
        System.out.println("------------1-------------");
        while(count1 > 0){
            newarr[k++] = 1;
            count1--;
            System.out.println(k);
        }
        System.out.println("------------2-------------");
        while(count2 > 0){
            newarr[k++] = 2;
            count2--;
            System.out.println(k);
        }
        
        return newarr;
    }
}