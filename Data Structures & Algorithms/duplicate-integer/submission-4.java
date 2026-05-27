class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Initialize an empty hash set to store seen values.
        // Iterate through each number in the array.
        // For each number:
        // If it is already in the set, return true because a duplicate has been found.
        // Otherwise, add it to the set.
        // If the loop finishes without finding any duplicates, return false.
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}