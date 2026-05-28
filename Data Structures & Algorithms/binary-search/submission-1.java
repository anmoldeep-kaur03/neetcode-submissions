public class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l<=r){
            int m = (l + r)/2;
            if(nums[m] == target){
                return m;
            } else if(nums[m] < target) {
                l = m+1;
            } else if(nums[m] > target){
                r = m-1;
            }
        }
        return -1;
    }
}
// Initialize two pointers:
// l = 0 (start of array)
// r = len(nums) - 1 (end of array)
// While l <= r:
// Compute m = l + (r - l) // 2 (safe midpoint).
// If nums[m] == target, return m.
// If nums[m] < target, move search to the right half: update l = m + 1.
// If nums[m] > target, move search to the left half: update r = m - 1.
// If the loop ends without finding the target, return -1.