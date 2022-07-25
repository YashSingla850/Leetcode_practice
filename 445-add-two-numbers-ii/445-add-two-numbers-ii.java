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
        ListNode prev = null ;
        ListNode cur = head;
        while(cur!=null){
            ListNode forw = cur.next;
            cur.next  = prev;
            prev = cur;
            cur = forw;
            
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null || l2==null){
            return (l1!=null?l1:l2);
        }
        ListNode c1 = reverse(l1);
        ListNode c2 = reverse(l2);
        ListNode head = new ListNode(-1);
        ListNode itr = head;
        int carry = 0;
        while(c1!=null || c2!=null || carry!=0){
           int sum = carry+(c1!=null?c1.val:0)+(c2!=null? c2.val:0);
           int id  = sum%10;
            carry = sum/10;
            itr.next = new ListNode(id);
            itr = itr.next;
            if(c1!=null)c1 = c1.next;
            if(c2!=null)c2 = c2.next;
        }
        return reverse(head.next);
    }
}