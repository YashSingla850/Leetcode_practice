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
    public ListNode partition(ListNode head, int x) {
        if(head==null|| head.next==null)return head;
        ListNode pl = new ListNode(-1);
        ListNode pz = pl;
        ListNode pg = new ListNode(-1);
        ListNode po = pg;
        ListNode cur = head;
        while(cur!=null){
            if(cur.val<x){
                pz.next = cur;
                pz = pz.next;
            }else{
                po.next  = cur;
                po = po.next;
            }
            cur = cur.next;
        }
        pz.next = pg.next;
        po.next = null;
        return pl.next;
    }
}