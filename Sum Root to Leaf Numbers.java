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
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null)
        return 0;
        
        return dfs(root, 0);
    }
    public int dfs(TreeNode root, int sum)
    {
        if(root==null)
        return 0;
        
        sum = sum * 10 + root.val;
        if(root.left==null && root.right==null)
        {
            return sum;
        }
        return dfs(root.left, sum) + dfs(root.right, sum);
    }
}
