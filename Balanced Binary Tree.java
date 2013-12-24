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
    public boolean isBalanced(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(root==null) return true;
        return dfs(root)!=-1;
    }
    public int dfs(TreeNode root)
    {
        if(root==null) return 0;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(Math.abs(left-right)>1) return -1;
        if(left==-1 || right==-1) return -1;
        return Math.max(left, right)+1;
    }
}
