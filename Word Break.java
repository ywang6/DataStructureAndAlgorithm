public class Solution {
    // public boolean wordBreak(String s, Set<String> dict) {
    //     // IMPORTANT: Please reset any member data you declared, as
    //     // the same Solution instance will be reused for each test case.
        
    //     return dfs(s, dict);
        
    // }
    // public boolean dfs(String s, Set<String> dict)
    // {
    //     if(s.length()==0)
    //     {
    //         return true;
    //     }
        
    //     for(int i = 1; i<=s.length(); i++)
    //     {
    //         String str = s.substring(0,i);
    //         if(dict.contains(str))
    //         {
    //             return str.length()==0 || dfs(s.substring(i), dict);
    //         }
    //     }
    //     return false;
    // }
    public boolean wordBreak(String s, Set<String> dict) {
    if(s == null || dict == null) return false;
    boolean[] dp = new boolean[s.length()+1];
    dp[0] = true;
    for(int i = 1; i <= s.length(); i++)
        for(int k = 0; k < i; k++)
            if(dp[k] && dict.contains(s.substring(k, i))) dp[i] = true;
    return dp[s.length()];
}
}