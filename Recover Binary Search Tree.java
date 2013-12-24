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
    public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
        inOrderTraverse(root, nodes);
        int i, j;
        for( i =0; nodes.get(i).val<nodes.get(i+1).val; i++);
        for( j =nodes.size()-1; nodes.get(j).val>nodes.get(j-1).val; j--);
        int temp = nodes.get(i).val;
        nodes.get(i).val = nodes.get(j).val;
        nodes.get(j).val = temp;
        return;
    }
    public void inOrderTraverse(TreeNode node, ArrayList<TreeNode> nodes){
        if(node == null)
            return;
        inOrderTraverse(node.left, nodes);
        nodes.add(node);
        inOrderTraverse(node.right, nodes);
    }
}
