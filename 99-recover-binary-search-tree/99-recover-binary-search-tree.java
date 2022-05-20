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
    public void recoverTree(TreeNode root) {
        TreeNode prev =null,cur =root ,n1 =null,n2 =null;
        while(cur!=null){

        if(cur.left==null){
            if(prev!=null){
                if(cur.val<prev.val){
                    if(n1==null){
                        n1 =prev;
                        n2 =cur;
                    }else{
                        n2 =cur;
                    }
                }
            }
            prev =cur;
            cur =cur.right;
        }else{
            TreeNode iop = cur.left;
            while(iop.right!=null&&iop.right!=cur){
                iop =iop.right;
            }
            if(iop.right==null){
                iop.right =cur;
                cur=cur.left;
                
            }else{
                  if(prev!=null){
                if(cur.val<prev.val){
                    if(n1==null){
                        n1 =prev;
                        n2 =cur;
                    }else{
                        n2 =cur;
                    }
                }
            }
            prev =cur;
                iop.right =null;
            cur =cur.right ; 
            }
            
        }
        }
        int temp =n1.val;
        n1.val =n2.val;
        n2.val =temp;
        
    }
}