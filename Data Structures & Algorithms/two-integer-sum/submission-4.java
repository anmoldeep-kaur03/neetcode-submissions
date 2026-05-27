public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
}
// Create a hash map to store the value and index of each element in the array.
// Iterate through the array using index i and compute the complement of the current element, which is target - nums[i].
// Check if the complement exists in the hash map.
// If it does, return the indices of the current element and its complement.
// If no such pair is found, return an empty array.