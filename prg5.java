// https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
// Given an unsorted array arr[ ] having both negative and positive integers. 
// The task is to place all negative elements at the end of the array without changing the order of positive elements and negative elements.

import java.util.Arrays;

public class prg5 {
    public static void main(String[] args) {
        int arr[] = {3, -2, 1, -5, 6, -4, 90, 89};
        System.out.println("The segregation of elements in an array is: " + Arrays.toString(segregateElements(arr)));
    }

    public static int[] segregateElements(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] >= 0)
                temp[j++] = arr[i];
        }

        for(int i = 0; i < n; i++){
            if(arr[i] < 0)
                temp[j++] = arr[i];
        }
            
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
        return arr;
    }
}
