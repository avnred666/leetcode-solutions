import java.util.Arrays;

/* https://leetcode.com/problems/merge-sorted-array */
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
