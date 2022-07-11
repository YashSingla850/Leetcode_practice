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
    int max  =0;
    public int diameterOfBinaryTree(TreeNode root) {
         max = 0;
        helper(root);
        return max-1;
    }
    public int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        int lh = helper(node.left);
        int rh =  helper(node.right);
        int th = lh+rh+1;
            if(max<th){
                max = th;
            }
        return Math.max(lh, rh)+1;
    }
    
}