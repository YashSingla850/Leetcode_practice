/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node cur =root;
        Node head =null , tail = null;
       while(cur!=null){
           while(cur!=null){
            if(cur.left!=null){
                if(head==null){
                    head =cur.left;
                    tail = cur.left;
                }else{
                    tail.next = cur.left;
                    tail = cur.left;
                }
            }
               if(cur.right!=null){
                if(head==null){
                    head = cur.right;
                    tail = cur.right;
                }else{
                      tail.next = cur.right;
                    tail = cur.right;
                }
            }
            cur = cur.next;
        }
           cur = head;
           head =null;
           tail=null;
     }
        return root;
    }
}