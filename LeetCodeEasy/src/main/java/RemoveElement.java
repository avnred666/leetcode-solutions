/* https://leetcode.com/problems/remove-element/ */

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 *
 * Solution Logic: Two pointer method. The first pointer(k) traverses through the array while at the same time taking a count of elements not equal to the value to be removed(val).
 * The second pointer(i) moves through the array, compares value of each element to val. If it is not equal to val, swap the element with the element at k index.
 * This essentially pushes the value/values to be removed to the end of the array.
 * First iteration:
 * k=0, i =0, val = 3
 * [1,2,3,4,3]  => [1,2,3,4,3] , k =1, i=1
 * Second iteration:
 * k=1, i = 1
 * [1,2,3,4,3]  => [1,2,3,4,3], k=2, i=2
 * Third iteration:
 * k=2, i=2. val matches, k is not incremented
 * [1,2,3,4,3] => [1,2,3,4,3], k=2, i=3
 * Fourth iteration:
 * k=2, i=3
 * [1,2,3,4,3] => [1,2,3,4,3], k=3,i=4
 * Fifth iteration:
 * k=3,i=4
 * [1,2,3,4,3] => [1,2,4,3,3], k=4,i=5
 * End
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int valToRemove = 3;
        int k = solution.removeElement(nums, valToRemove);
        System.out.println("New length: " + k);
        System.out.print("Modified array: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
