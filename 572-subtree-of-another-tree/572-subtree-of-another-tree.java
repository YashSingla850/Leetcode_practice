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
public boolean isSubtree(TreeNode root, TreeNode subRoot) {
if(subRoot==null) return true;
if(root==null) return false;
if(root.val==subRoot.val){
if(isIdentical(root,subRoot)){
return true;
}
}
return (isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot));
}

public boolean isIdentical(TreeNode root, TreeNode subRoot){
if(root==null && subRoot==null) return true;
if(root==null || subRoot==null) return false;
if(root.val==subRoot.val){
return (isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right));
}
return false;
}
}




// class Solution {
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        if(root==null){
//            return false;
//        }
//         if(subRoot==null) return true;
//         if(root.val==subRoot.val){
//              return helper(root,subRoot);
            
//         }
//         return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//     }
//     public boolean helper(TreeNode n1 , TreeNode n2){
//         if(n1==null&&n2==null){
//             return true;
//         } 
//         if(n1==null&&n2!=null||n1!=null&&n2==null){
//             return false;
//         }
//        if(n1.val ==n2.val){
        
//         return (helper(n1.left,n2.left)&&helper(n1.right,n2.right));
//        }
//         return false;
//     }
// }

