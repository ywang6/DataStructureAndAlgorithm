public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length==0) return 0;
        int max = 0;
        for(int i =1;i<prices.length; i++){
            if(prices[i]>prices[i-1])
                max += prices[i] -prices[i-1];
        }
        return  max;
    }
}
