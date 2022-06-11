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
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ans = false;
        helper(root, 0 ,targetSum);
        return ans;
        
    }
    public void helper(TreeNode node , int sum , int tar){
        if(node==null){
            return;
        }
        sum = sum+node.val;
       
        helper(node.left , sum,tar);
        helper(node.right , sum ,tar);
         if(node.left==null &&node.right==null){
            // sum = sum+node.val;
            if(sum==tar){
                ans =true;
            }
        
        }
    }
}