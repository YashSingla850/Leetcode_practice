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
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null) return true;
        ListNode mid = mid(head);
        ListNode nhead = mid.next;
       nhead = reverse(nhead);
        mid .next = null;
        ListNode p1 = head;
        ListNode p2 = nhead;
        boolean flag = true;
        while(p1!=null&&p2!=null){
            if(p1.val!=p2.val){
                flag = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        nhead = reverse(nhead);
        mid.next = nhead;
        
        return flag;
    }
    
    public ListNode mid(ListNode head){
        if(head==null ||head.next==null) return head;
        ListNode slow  = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode prev = null , front = null , cur = head;
        while(cur!=null){
            front = cur.next;
            cur.next = prev;
            prev = cur;
            cur = front;
            
        }
        return prev;
    }
}