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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(p==null && q==null) return true;
        else if(p!=null && q!=null)
        return (p.val==q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        else
        return false;
    }
}
