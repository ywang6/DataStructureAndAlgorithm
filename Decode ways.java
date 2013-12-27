private static int generate(String s) {
        int len = s.length();
        if (0 == len || s.charAt(0) == '0') {
            return 0;
        }
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < len + 1; i++) {
            char curChar = s.charAt(i - 1);
            int curNum = curChar - '0';
            // s[i] is not valid
            if (curNum == 0) {
                String twoNum = s.substring(i - 2, i);
                // s[i-1][i] is valid
                if (Integer.parseInt(twoNum) <= 26
                        && Integer.parseInt(twoNum) >= 10) {
                    dp[i] = dp[i - 2];
                } else {
                    dp[i] = 0;
                }
            }
            // s[i] is valid
            else {
                String twoNum = s.substring(i - 2, i);
                // s[i-1][i] is valid
                if (Integer.parseInt(twoNum) <= 26
                        && Integer.parseInt(twoNum) >= 10) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                } else {
                    dp[i] = dp[i - 1];
                }
            }
        }

        return dp[len];
    }
  ////////////////////////////////////////////////////////////////////////////
  //other way
  ////////////////////////////////////////////////////////////////////////////
  public class Solution {
    public int numDecodings(String s)
    {
        return numDecoding(s, 0);
    }
    public int numDecoding(String s, int res) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	res = 0;
        if(s.isEmpty())
        return 1;
        
        for(int i = 1; i<= s.length(); i++)
        {
            if(isValid(s.substring(0,i)))
            {
                res = res + numDecoding(s.substring(i),res);
            }
        }
        return res;
    }
    public boolean isValid(String str)
    {
        int a = Integer.parseInt(str);
        if(a>=1 && a<=26)
        return true;
        else
        return false;
    }
}
