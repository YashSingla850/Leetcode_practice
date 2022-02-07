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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null || list2==null){
            return list1!=null?list1:list2;
        }
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
        while(c1!=null&&c2!=null){

        if(c1.val<=c2.val){
            prev.next = c1;
            c1 = c1.next;
         }else{
            prev.next =c2;
            c2 =c2.next;
        }
           prev = prev.next; 
           
            
            
        }
         prev.next= c1!= null?c1:c2;
            ListNode head = dummy.next;
            dummy.next = null;
        return head;
        
    }
}