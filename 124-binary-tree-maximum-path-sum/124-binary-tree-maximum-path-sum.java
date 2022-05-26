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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
         max = Integer.MIN_VALUE;
           maxPathSumNtn(root);
         return max;

        }
    public int maxPathSumNtn(TreeNode node){
        if(node==null){

            return 0;
        }
        int left = maxPathSumNtn(node.left);
        int right = maxPathSumNtn(node.right);
        int left_dash = Math.max(0,left);
        int right_dash = Math.max(0,right);
        int sumFromLeftToRight =left_dash+right_dash+node.val;
        if(sumFromLeftToRight>max){
            max = sumFromLeftToRight;
        }
        return Math.max(left_dash,right_dash)+node.val;
    }
   
    }
