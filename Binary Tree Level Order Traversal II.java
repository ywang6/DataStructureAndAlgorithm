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
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<TreeNode> q = new ArrayList<TreeNode>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        if(root==null) return res;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode cur = q.remove(0);
            if(cur==null)
            {
                res.add(row);
                row = new ArrayList<Integer>();
                if(!q.isEmpty())
                q.add(null);
            }
            else
            {
                row.add(cur.val);
                if(cur.left!=null)
                q.add(cur.left);
                if(cur.right!=null)
                q.add(cur.right);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
