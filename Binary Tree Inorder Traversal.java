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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root==null) return res;
        TreeNode cur = root;
        while(true)
        {
            if(cur!=null)
            {
                stack.push(cur);
                cur = cur.left;
            }
            else
            {
                if(stack.isEmpty()) return res;
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        
    }
}
