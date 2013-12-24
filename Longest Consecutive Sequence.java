public class Solution {
    public int longestConsecutive(int[] num) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        HashSet<Integer> dic = new HashSet<Integer>();
        for(int n : num)
        dic.add(n);
        int max = Integer.MIN_VALUE;
        
        for(int i : num)
        {
            int ele1 = i, ele2 = i;
            int count = 1;
            while(dic.contains(ele1-1))
            {
                count++;
                ele1 = ele1-1;
                dic.remove(ele1);
            }
            while(dic.contains(ele2+1))
            {
                count++;
                ele2 = ele2+1;
                dic.remove(ele2);
            }
            if(count>max)
            max = count;
        }
        return max;
    }
}
