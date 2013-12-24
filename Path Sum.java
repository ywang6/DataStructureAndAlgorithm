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
    public boolean hasPathSum(TreeNode root, int sum) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(root==null)
        return false;
        if(root.left==null && root.right==null && sum==root.val)
        return true;
        
        boolean left = hasPathSum(root.left, sum-root.val);
        boolean right = hasPathSum(root.right, sum-root.val);
        return left || right;
    }
}
