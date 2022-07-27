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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)return head;
        // ListNode dummy = new ListNode(-1);
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode forw = cur.next;
            cur.next = prev;
            prev = cur;
            cur = forw; 
        }
        return prev;
    }
    
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null)return head;
         ListNode cur = head;
        ListNode prev = null;
        while(cur!=null&&left>1){
            prev = cur;
            cur = cur.next;
            left--;
        }
        ListNode fast = head;
        while(fast!=null && right>1){
            fast = fast.next ;
            right--;
        }
         ListNode rights=fast.next;
        fast.next = null;
        ListNode reverse = reverse(cur);
        if(prev!=null){
            prev.next = reverse;
        }else{
            head = reverse;
        }
        ListNode curr  = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next  = rights;
        return head;
    }
}