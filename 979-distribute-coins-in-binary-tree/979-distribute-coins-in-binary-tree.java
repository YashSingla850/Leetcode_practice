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
    class pair{
        int node;
        int coins;
    }
    int moves =0;
     public pair helper(TreeNode node){
        if(node==null){
            return new pair();
        }
        pair lp = helper(node.left);
        pair rp = helper(node.right);
        pair np = new pair();
        np.node = lp.node+rp.node+1;
        np.coins = lp.coins+rp.coins+node.val;
        moves += Math.abs(np.node -np.coins);
         return np;
    }
    public int distributeCoins(TreeNode root) {
        helper(root);
       return moves; 
    }
   
}