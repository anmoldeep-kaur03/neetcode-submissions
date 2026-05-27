public class Solution {
    public int maxProfit(int[] prices) {
        // int l = 0;
        // int r = 1;
        // int maxP = 0;
        // while(r<prices.length){
        //     if(prices[r] > prices[l]){
        //         int profit = prices[r]-prices[l];
        //         maxP = Math.max(maxP, profit);
        //     } else {
        //         l = r;
        //     }
        //     r++;
        // }
        // return maxP;
        int minBuy = prices[0]; //1
        int maxP = 0;  // 5
        for(int sell:prices){ // 7 1 5 3 6 4
        // sell = 4
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }
}