public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] profit1 = new int[n];
        int[] profit2 = new int[n];
        if(n==0) return 0;
        
        int min = prices[0];
        int max = prices[n-1];
        int res = 0;
        for(int i = 1; i<n; i++)
        {
            min = Math.min(min, prices[i]);
            profit1[i] = Math.max(profit1[i-1], prices[i] - min);
        }
        for(int i = n-2; i>=0; i--)
        {
            max = Math.max(max,prices[i]);
            profit2[i] = Math.max(profit2[i+1], max - prices[i]);
        }
        for(int i = 0; i<n; i++)
        {
            res = Math.max(res, profit1[i] + profit2[i]);
        }
        return res;
    }
}
