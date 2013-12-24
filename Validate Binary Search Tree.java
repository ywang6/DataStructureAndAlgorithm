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
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
    return  dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public boolean dfs(TreeNode root, int min, int max)
    {
        if(root==null)
        return true;
        
        boolean left = dfs(root.left, min, root.val);
        boolean right = dfs(root.right, root.val, max);
        return left&&right&&(root.val<max)&&(root.val>min);
    }
}
