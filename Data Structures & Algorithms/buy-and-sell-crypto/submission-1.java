public class Solution {
    public int maxProfit(int[] prices) {
        // If the two strings have different lengths, return false immediately.
        // Create two hash maps to store character frequencies for each string.
        // Iterate through both strings at the same time:
        // Increase the character count for s[i] in the first map.
        // Increase the character count for t[i] in the second map.
        // After building both maps, compare them:
        // If the maps are equal, return true.
        // Otherwise, return false.
        int minBuy = prices[0]; 
        int maxP = 0;  
        for(int sell:prices){ 
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }
}
