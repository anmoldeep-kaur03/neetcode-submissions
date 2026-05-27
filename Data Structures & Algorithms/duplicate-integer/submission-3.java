class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Sort the array in non-decreasing order.
        // Iterate through the array starting from index 1.
        // Compare the current element with the previous element.
        // If both elements are equal, we have found a duplicate — return true.
        // If the loop finishes without detecting equal neighbors, return false.
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}