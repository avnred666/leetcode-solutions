/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * To find the majority element in an array where the majority element is defined as the element that appears more than ⌊n / 2⌋ times, you can use the Boyer-Moore Voting Algorithm. This algorithm is efficient and works in linear time with constant extra space.
 *
 * Here's the basic idea of the Boyer-Moore Voting Algorithm:
 * <p>
 * Initialize Two Variables: A candidate for holding the potential majority element, and a count variable for keeping track of the number of times the candidate has been encountered.
 * <p>
 * First Pass - Identify a Candidate:
 * <p>
 * Iterate through the array. For each element:
 * If count is 0, set the current element as the candidate.
 * If the current element is the same as candidate, increment count.
 * Otherwise, decrement count.
 * Second Pass - Verify the Candidate:
 * <p>
 * Optionally, make a second pass over the array to verify that the candidate is indeed the majority element.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num: nums){
            if(count == 0){
                candidate = num;
            }
            if (num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element: " + solution.majorityElement(nums));
    }
}
