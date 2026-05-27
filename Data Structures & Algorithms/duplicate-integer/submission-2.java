class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Iterate through the array using two nested loops to check all possible pairs of distinct indices.
        // If any pair of elements has the same value, return true.
        // If all pairs are checked and no duplicates are found, return false.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}