public class Solution {
    public int numDistinct(String S, String T) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(S==null &&  T==null) return 0;
        else if(S==null) return 0;
        else if(T==null)
        return S.length();
        
        if(S.length()<T.length()) return 0;
        int j = 0;
        for(int i = 0; i<S.length(); i++)
        {
            if(j==T.length())
            return S.length()-T.length()+1;
            if(S.charAt(i)==T.charAt(j))
            {
                j++;
                continue;
            }
        }
        if(j==0) return 0;
        else return j;
    }
}
