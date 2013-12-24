/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public ArrayList<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }

    public ArrayList<TreeNode> generateTrees(int start, int end){
        ArrayList<TreeNode> unique = new ArrayList<TreeNode>();
        if(start > end){
            unique.add(null);
            return unique;
        }
        for(int i = start; i <= end; i++){
            for(TreeNode left: generateTrees(start, i - 1)){
                for(TreeNode right: generateTrees(i + 1, end)){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    unique.add(root);
                }
            }
        }
        return unique;
    }
}
