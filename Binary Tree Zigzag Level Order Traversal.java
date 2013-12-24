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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        ArrayList<TreeNode> q = new ArrayList<TreeNode>();
        boolean flag = false;
        if(root==null)
        return res;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode cur = q.remove(0);
            if(cur==null)
            {
                if(flag)
                Collections.reverse(tmp);
                res.add(tmp);
                tmp = new ArrayList<Integer>();
                flag = !flag;
                if(!q.isEmpty())
                {
                    q.add(null);
                }
            }
            else
            {
                tmp.add(cur.val);
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
            }
        }
        return res;
    }
}
