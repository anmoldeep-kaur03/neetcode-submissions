public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] A = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            A[i][0] = nums[i];
            A[i][1] = i;
        }

        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int cur = A[i][0] + A[j][0];
            if (cur == target) {
                return new int[]{Math.min(A[i][1], A[j][1]),
                                 Math.max(A[i][1], A[j][1])};
            } else if (cur < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}
// Create a copy of the array and sort it in ascending order.
// Initialize two pointers, one at the beginning (i) and one at the end (j) of the array.
// Iterate through the array with the two pointers and check if the sum of the two numbers is equal to the target.
// If the sum is equal to the target, return the indices of the two numbers.
// If the sum is less than the target, move the left pointer i to the right, which will increase the sum.
// If the sum is greater than the target, move the right pointer j to the left, which will decrease the sum.
// There is guaranteed to be exactly one solution, so we will never return an empty array.