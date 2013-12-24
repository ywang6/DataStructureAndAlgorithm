public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length==0) return 0;
        int max = 0;
        int min = prices[0];
        for(int i =1;i<prices.length; i++){
            min = Math.min(prices[i], min);
            max = Math.max(max, prices[i] - min);
        }
        return  max;
    }
}
