/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public  ListNode mid(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode slow = head ;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow  = slow.next;
            fast  = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode prev =  null;
        ListNode cur = head;
        while(cur!=null){
            ListNode forw  = cur.next;
            cur.next = prev;
            prev = cur ; 
            cur = forw;
        }
        return prev;
    }
    
    public void reorderList(ListNode head) {
        
        
        if(head==null || head.next==null)return ;
         ListNode mid  = mid(head);
        ListNode  nhead = reverse(mid.next);
        mid.next = null;
        ListNode prev = head , lprev = nhead;
        while(lprev!=null){
            ListNode  forw = prev.next;
            ListNode lforw = lprev.next;
            prev.next  = lprev;
              // if (forw == null)
              //    break;
            lprev.next  = forw;
            prev  = forw;
            lprev = lforw;
        }
        
    }
}
      