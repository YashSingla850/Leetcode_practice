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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        TreeNode cur = root;
        while(cur!=null){
            if(cur.left==null){
                ans.add(cur.val);
                cur =cur.right;
                
            }else{
                TreeNode iop = cur.left;
                while(iop.right!=null&&iop.right!=cur){
                    iop = iop.right;
                }
                    if(iop.right==null){
                         ans.add(cur.val);
                        iop.right=cur;
                        cur = cur.left;
                    }else{
                       
                        iop.right =null;
                           
                        cur = cur.right;
                        
                    }
            }
        }
        return ans;
        
    }
}