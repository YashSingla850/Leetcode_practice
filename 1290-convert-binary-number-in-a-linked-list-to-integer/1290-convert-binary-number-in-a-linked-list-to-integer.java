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
       String s = "";
        if(head ==null){
            return 0;
        }
        ListNode temp = head;
        while(temp!=null){
            s= s+temp.val;
            temp = temp.next;
        }
          int decimal=Integer.parseInt(s,2);
        return decimal;
        
    }
}