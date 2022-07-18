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
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if(head1==null || head2==null)return null;
      
        ListNode p1 = head1 ,p2 = head2;
        while(p1!=p2){
            if(p1==null){
                p1 = head2;
            }else{
                p1 = p1.next;
            }
            if(p2==null){
                p2 = head1;
            }else{
                p2 = p2.next;
            }
        }
        return p1;
    }
}














// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA==null || headB==null){
//             return null;
//         }
//         ListNode pa = headA;
//         ListNode pb = headB;
        
//         while(pa!=pb){
//             if(pa==null){
//                 pa=headB;
//             }else{
//                 pa = pa.next;
//             }
//             if(pb==null){
//                 pb= headA;
//             }else{
//                 pb = pb.next;
//             }
            
//         }
//         return pa;
//     }
// }