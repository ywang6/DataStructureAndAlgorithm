public class Solution {
    public int singleNumber(int[] A) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
       if(A.length==0) return 0;
       int res = 0;
       int bit[] = new int[32];
       for(int i = 0; i<32; i++)
       {
           for(int j = 0; j<A.length; j++)
           {
               if((A[j]>>i & 1) ==1)
               {
                   bit[i] = (bit[i] + 1)%3;
               }
           }
           res |= bit[i]<<i;
       }
       return res;
    }
}