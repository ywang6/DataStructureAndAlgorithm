import java.util.Set;
import java.util.HashSet;
import java.util.Hashtable;
public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Hashtable<String,String> path = new Hashtable<String,String>();//current, prev
        Set<String> visit = new HashSet<String>();
        Queue<String> queue = new LinkedList<String>();//bfs queue
        queue.add(start);
        visit.add(start);
        while(queue.size()>0){
            String prev = queue.poll();
            for(String curr: adjacent(prev, dict)){//adjacent words
                if(curr.equals(end)){
                    int count = 1;
                    while(prev!=null){
                        prev = path.get(prev);
                        count++;
                    }
                    return count;
                }
                if(!visit.contains(curr)){
                    path.put(curr, prev);
                    visit.add(curr);
                    queue.add(curr);
                }
            }
        }
        return 0;
    }
    public Set<String> adjacent(String str, Set<String> dict){
        Set<String> res = new HashSet<String>();
        for(int i=0;i<str.length();i++){
            for(char j='a';j<='z';j++){
                char[] chs = str.toCharArray();
                if(chs[i]!=j){
                    chs[i]=j;
                    String nstr = new String(chs);
                    if(dict.contains(nstr))
                        res.add(nstr);
                }
            }
        }
        return res;
    }
}
