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
    public int getDecimalValue(ListNode head) {
      String s="";
        int ans =0;
        while(head!=null){
            s =s + head.val;
            head = head.next;
        }
            return Integer.parseInt(s,2);
    }
}