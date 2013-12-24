public class Solution {
    public int numTrees(int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int[] num = new int[n+1];
         num[0] = 1;
         num[1] = 1;
        for(int i = 2; i<=n; i++)
        {
            for(int j = 0; j<i; j++)
            {
                num[i] = num[i] + num[j] * num[i-j-1];
            }
        }
        return num[n];
    }
}
