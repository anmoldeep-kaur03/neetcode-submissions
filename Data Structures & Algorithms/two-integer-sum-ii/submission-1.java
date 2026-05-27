class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int p1 = 0; 
        // int p2 = numbers.length-1;
        // while (p1 < p2){
        //     int sum = numbers[p1] + numbers[p2];
        //     if(sum == target){
        //         return new int[]{p1+1, p2+1};
        //     } else if(sum<target){
        //         p1++;
        //     } else {
        //         p2--;
        //     }
        // }
        // return new int[0];
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = target - numbers[i];
            if (mp.containsKey(tmp)) {
                return new int[] { mp.get(tmp), i + 1 };
            }
            mp.put(numbers[i], i + 1);
        }
        return new int[0];
    }
}
