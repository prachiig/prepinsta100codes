import java.util.*;

public class prg3 {
    public static void main(String[] args) {
        int arr1[] = {3, 2, 1, 5, 6, 4};
        int arr2[] = {1, 5, 3, 91};

        System.out.println("The intersection of 2 arrays is: " + Arrays.toString(intersection(arr1, arr2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> hset = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int a : nums1)
            hset.add(a);
        for(int a : nums2){
            if(hset.contains(a)){
                list.add(a);
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
