public class Solution {
   
    public static HashMap<String, Boolean> map = new HashMap<String,Boolean>();
    public ArrayList<ArrayList<String>> partition(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        dfs(s, new ArrayList<String>(), res);
        return res;
    }
    public void dfs(String s, ArrayList<String> buff, ArrayList<ArrayList<String>> res)
    {
        if(s.isEmpty())
        {
            ArrayList<String> nbuff = new ArrayList<String>(buff);
            Collections.sort(nbuff);
            res.add(nbuff);
            return;
        }
        for(int i = 1; i<=s.length(); i++)
        {
            if(isPali(s.substring(0,i)))
            {
                //ArrayList<String> nbuff = new ArrayList<String>(buff);
                buff.add(s.substring(0,i));
                dfs(s.substring(i), buff, res);
                buff.remove(s.substring(0,i));
            }
        }
    }
    
    public boolean isPali(String str)
    {
        if(map.containsKey(str)) return map.get(str);
        if(str==null)
        return true;
        
        int i = 0;
        int j = str.length() - 1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j)){
            map.put(str, false);
            return false;
            }
            
            i++;
            j--;
        }
        map.put(str, true);
        return true;
    }
}
