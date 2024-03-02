import java.util.HashMap;

/**
 * https://leetcode.com/problems/contains-duplicate-ii
 */
public class ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i]) <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3));
    }
}
