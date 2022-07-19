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
class BSTIterator {
 Stack<TreeNode>st = new Stack<>();
    public void pushAll(TreeNode node){
       for(; node!=null;st.push(node),node = node.left);
        // if(node!=null){
        //     st.push(node);
        //     node = node.left;
        }
    
    public BSTIterator(TreeNode root) {
        pushAll(root);
        
    }
    
    public int next() {
        TreeNode tmp = st.pop();
        pushAll(tmp.right);
        return tmp.val;
        
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */