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
     int diff =0;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
             return true;
        }
        diff =0;
         helper(root);
        if(diff>1){
            return false;
        }
        return true;
    }
    public  int helper (TreeNode node){

            if(node ==null){
           return 0 ;
        }
       int lh = helper(node.left);
        int rh = helper(node.right);
          int temp = Math.abs(rh -lh);
        if(temp>diff){
            diff = temp;
        }
        return Math.max(lh,rh)+1;
    }
}