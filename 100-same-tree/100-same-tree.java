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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if(p==null&&q==null){
           return true;
       }
        if(p==null&&q!=null || p!=null&&q==null){
            return false;
        }
        if(p.val==q.val){
            return (isSameTree(p.left,q.left)&&isSameTree(p.right,q.right));
        }
        return false;
        
        
    }
    
}

// class Solution {
//     // boolean flag= false;
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//            return helper(p,q,true);
//     }
//     public boolean helper(TreeNode n1, TreeNode n2,boolean flag){
//         if(n1==null&&n2==null){
//                return true;
//         }
//         if(n1==null &&n2!=null || n1!=null&&n2==null){
//             return false;
//         }
//         helper(n1.left,n2.left,flag);
//         helper(n1.right,n2.right,flag);  
         
//         if(n1.val==n2.val && flag ==true){
//             return true;
//         }else{
            
//         }
        
        
//     }
// }