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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
        return new ArrayList<Integer>();
        Stack<TreeNode> in = new Stack<TreeNode>();
        Stack<TreeNode> out = new Stack<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        in.push(root);
        while(!in.isEmpty())
        {
            TreeNode cur = in.pop();
            out.push(cur);
            if(cur.left!=null) in.push(cur.left);
            if(cur.right!=null) in.push(cur.right);
        }
        while(!out.isEmpty())
        res.add(out.pop().val);
        
        return res;
    }
}