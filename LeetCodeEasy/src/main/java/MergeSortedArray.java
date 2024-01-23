import java.util.Arrays;

/* https://leetcode.com/problems/merge-sorted-array */

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 * Solution Logic: Two pointer method. Pointers i, j, and k holds the indexes of the last position of valid elements in num1, elements in num2 and combined array of both respectively.
 * Working backwards from the last index, compare each element in nums1 to each element in nums2. The bigger element is drafted working backwards from the last index of combined array.
 * This is done because both arrays are already sorted. At the end if there are still remaining elements in nums2 which are less than all the elements in nums1, they are drafted in.
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Indexes for the last elements in nums1 and nums2
        int i = m - 1;
        int j = n - 1;

        // Index for the last position in merged array
        int k = m + n - 1;

        // Merge nums1 and nums2 from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        // Fill nums1 with remaining elements of nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {4,5,6};
        merge(nums1,m,nums2,n);
    }
}
