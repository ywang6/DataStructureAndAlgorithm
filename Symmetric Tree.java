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
    public boolean isSymmetric(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(root==null) return true;
        return bfs(root.left, root.right);
    }
    public boolean bfs(TreeNode n1, TreeNode n2)
    {
        if(n1==null && n2==null)
        return true;
        else if(n1!=null && n2!=null)
        return (n1.val==n2.val) && bfs(n1.left,n2.right) && bfs(n1.right, n2.left);
        else
        return false;
    }
}
