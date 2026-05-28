public class Solution {
    public int binary_search(int l, int r, int[] nums, int target) {
        if (l > r) return -1;
        int m = l + (r - l) / 2;

        if (nums[m] == target) return m;
        return (nums[m] < target) ?
            binary_search(m + 1, r, nums, target) :
            binary_search(l, m - 1, nums, target);
    }

    public int search(int[] nums, int target) {
        return binary_search(0, nums.length - 1, nums, target);
    }
}
// Define a recursive function that takes the current search range [l, r].
// If l > r, the range is empty, return -1.
// Compute the middle index m = (l + r) // 2.
// Compare nums[m] with target:
// If equal, return m.
// If nums[m] < target, recursively search [m + 1, r].
// If nums[m] > target, recursively search [l, m - 1].
// Start the recursion with the full range [0, n - 1].
// Return the final result.