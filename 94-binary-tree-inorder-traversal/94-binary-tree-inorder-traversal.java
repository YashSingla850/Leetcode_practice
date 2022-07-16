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
     List<Integer> ans;
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
        Stack<TreeNode>st = new Stack<>();
        // if(root==null)return new ArrayList<>();
        TreeNode node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node = node.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                ans.add(node.val);
                node = node.right;
            }
        }
        return ans;
}
 }


// class Solution {
//      List<Integer> ans;
//     public List<Integer> inorderTraversal(TreeNode root) {
//        ans = new ArrayList<>();
//         if(root==null){
//             return new ArrayList<>();
//         }
//         helper(root);    
//         return ans;
//     }
//     public void helper(TreeNode node){
//         if(node==null){
//             return ;
//         }
//         helper(node.left);
//             ans.add(node.val);
//         helper(node.right);
//     }
// }

// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer>ans = new ArrayList<>();
//         TreeNode cur = root;
//         while(cur!=null){
//             if(cur.left==null){
//                 ans.add(cur.val);
//                 cur =cur.right;
                
//             }else{
//                 TreeNode iop = cur.left;
//                 while(iop.right!=null&&iop.right!=cur){
//                     iop = iop.right;
//                 }
//                     if(iop.right==null){
//                         iop.right=cur;
//                         cur = cur.left;
//                     }else{
//                         iop.right =null;
//                         ans.add(cur.val);   
//                         cur = cur.right;
                        
//                     }
//             }
//         }
//         return ans;
        
//     }
// }