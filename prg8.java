import java.util.*;

public class prg8 {
    public static void main(String[] args) {
       
        int n[] = {4,9,4,8};
        System.out.println(findDuplicates(n));
        // System.out.println(Arrays.toString(sort012(arr)));
    }
   public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        System.out.println(map);
        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            if(x.getValue() == 2){
                list.add(x.getKey());
            }
        }

        for(int x : map.keySet()){
            if(map.get(x) == 2)
                System.out.println(x);
        }
        return list;
    }
}

