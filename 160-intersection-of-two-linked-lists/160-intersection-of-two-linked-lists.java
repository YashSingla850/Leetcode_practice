/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;
        
        while(pa!=pb){
            if(pa==null){
                pa=headB;
            }else{
                pa = pa.next;
            }
            if(pb==null){
                pb= headA;
            }else{
                pb = pb.next;
            }
            
        }
        return pa;
    }
}