/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode pre = null;
    public void flatten(TreeNode root) {
        if(root==null){
            return ;
        }
        TreeNode ol= root.left;
        TreeNode or = root.right;
        if(pre!=null){
            pre.left = null;
            pre.right = root;
            
        }
        pre = root;
        flatten(ol);
        flatten(or);
        
    }
}