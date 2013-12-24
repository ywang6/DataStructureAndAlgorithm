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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if(root==null) return new ArrayList<Integer>();
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(!stack.isEmpty())
        {
            TreeNode cur = stack.pop();
            res.add(cur.val);
            if(cur.right!=null)
            stack.push(cur.right);
            if(cur.left!=null)
            stack.push(cur.left);
            
        }
        return res;
    }
}