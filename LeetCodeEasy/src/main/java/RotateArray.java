/**
 * https://leetcode.com/problems/rotate-array/
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        reverse(nums,0,-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    public void reverse (int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        solution.rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
