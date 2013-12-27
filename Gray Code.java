public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int count = 1<<n;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i<count; i++)
        {
            res.add(i^(i>>1));
        }
        return res;
    }
}
