public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
// Iterate through the array with two nested loops using indices i and j to check every pair of different elements.
// If the sum of the pair equals the target, return the indices of the pair.
// If no such pair is found, return an empty array.
// There is guaranteed to be exactly one solution, so we will never return an empty array.
