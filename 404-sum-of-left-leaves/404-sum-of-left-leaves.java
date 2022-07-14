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
     int sum =0;
    public int sumOfLeftLeaves(TreeNode root) {
        sum =0;
        helper(root,false);
        return sum;
    }
    public void helper(TreeNode node,boolean flag){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            if(flag==true){
                sum+=node.val;
            }
        }
        helper(node.left,true);
        helper(node.right,false);
    }
}


//  47 test cases passed
// class Solution {
//      int sum =0;
//     TreeNode prev;
//     public int sumOfLeftLeaves(TreeNode root) {
//         sum =0;
//         // prev.val =0;
//         helper(root);
//         return sum;
//     }
//     public void helper(TreeNode node){
//         if(node==null){
//             return;
//         }
//         helper(node.left);
//         if(node.left==null&&node.right==null){
//             if(prev!=null){
//             sum = sum+prev.val;
//             }
//             prev = node;
//         }
//         helper(node.right);
//     }
// }