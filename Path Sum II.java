/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        path(root, sum, res, new ArrayList<Integer>());
        return res;
    }
    public void path(TreeNode root, int sum, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> buff)
    {
        if(root==null) return;
        
        buff.add(root.val);
        
        if(root.left==null && root.right==null && sum==root.val)
        {
            res.add(buff);
            return;
        }
        
        path(root.left, sum-root.val, res, new ArrayList<Integer>(buff));
        path(root.right, sum-root.val, res, new ArrayList<Integer>(buff));
        return;
    }
}
