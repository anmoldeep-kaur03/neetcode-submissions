class Solution {
    public boolean divideArray(int[] nums) {
        int num = 0;
        Arrays.sort(nums);
        for(int i =0; i<nums.length; i++){
            num^= nums[i];
            if(num != nums[i] && num != 0)
            return false;
        }
        
        if(num == 0) return true;
        return false;
    }
}