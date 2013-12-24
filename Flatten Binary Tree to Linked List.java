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
    public void flatten(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(root==null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode cur = stack.pop();
            if(cur.right!=null) stack.push(cur.right);
            if(cur.left!=null) stack.push(cur.left);
            cur.left=null;
            if(cur!=root)
            pre.right = cur;
            pre = cur;
        }
      
    }
}
