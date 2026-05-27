class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Convert the array into a hash set, which removes duplicates.
        // Compare the size of the set with the size of the original array.
        // If the set is smaller, return true because duplicates must have been removed.
        // Otherwise, return false.
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}