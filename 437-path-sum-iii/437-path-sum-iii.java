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
    int count =0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root ==null){
               return 0;
        }
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        
        helper(root,root.val,targetSum,map);
        return count;
    }
    public void helper(TreeNode root,int psum , int tar , HashMap<Integer,Integer>map){
        if(map.containsKey(psum-tar)==true){
              count+= map.get(psum-tar);
        }
              // map.put(psum ,map.getOrDefault(psum,0)+1);
          if(map.containsKey(psum)==false){
               map.put(psum,1);
          }else{
              map.put(psum,map.get(psum)+1);
          }
        
             if(root.left!=null){
            helper(root.left ,psum+root.left.val,tar,map);
        }
        if(root.right!=null){
             helper(root.right,psum+root.right.val,tar ,map);
        }
        if(map.get(psum)==1){
            map.remove(psum);
        }else{
            map.put(psum,map.get(psum)-1);
        }
    }
}