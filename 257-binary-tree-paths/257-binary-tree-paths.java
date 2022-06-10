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
    StringBuilder sb = new StringBuilder();
    // String sb = new String();
     List<String>list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        sb = new StringBuilder();
        
        helper(root , sb);
        return list;
        
    }
    
    public void helper(TreeNode node ,StringBuilder sb){
        if(node==null){
            return;
        }
        int len = sb.length();
        sb.append(node.val);
        if(node.left==null&&node.right==null){
          // sb.append("->");
          //   sb.append(node.val);
            list.add(sb.toString());
        }else{
            sb.append("->");
            helper(node.left,sb);
            helper(node.right,sb);
            
        }
        sb.setLength(len);
        
    }
    
}