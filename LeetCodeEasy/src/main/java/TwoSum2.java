import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target){
        int start = 0;
        int end = numbers.length-1;
        while (start<end){
            int sum = numbers[start]+numbers[end];
            if(sum == target){
                return new int[]{start+1,end+1};
            }
            else if(sum < target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
    }
}
