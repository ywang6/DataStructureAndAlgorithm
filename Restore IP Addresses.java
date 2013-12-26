public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<String> res = new ArrayList<String>();
        if(s.length()==0) return res;
        if(s.length()>12) return res;
        dfs(s, "", res, 0);
        return res;
    }
    public void dfs(String s, String buff, ArrayList<String> res, int count)
    {
        if(count==3 && isValid(s))
        {
            res.add(buff+s);
            return;
        }
        for(int i = 1;i<s.length() && i<4; i++)
        {
            String str = s.substring(0,i);
            if(isValid(str))
            {
                dfs(s.substring(i), buff+str+".", res, count+1);
            }
        }
    }
    public boolean isValid(String s)
    {
         if(s.charAt(0)=='0')return s.equals("0");
        int num = Integer.parseInt(s);
        return num>=0 && num<=255;
    }
}
