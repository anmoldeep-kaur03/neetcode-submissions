public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();  // val -> index

        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[]{i, indices.get(diff)};
            }
        }

        return new int[0];
    }
}
// Create a hash map to store the value and index of each element in the array.
// Iterate through the array and compute the complement of the current element, which is target - nums[i].
// Check if the complement exists in the hash map.
// If it does, return the indices of the current element and its complement.
// If no such pair is found, return an empty array.