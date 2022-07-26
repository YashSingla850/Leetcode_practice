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
    public ListNode mergeList(ListNode l1 , ListNode l2){
        if(l1==null || l2==null){
          return l1!=null?l1:l2;
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode c1 = l1;
        ListNode c2 = l2;
        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                prev.next = c1;
                c1 = c1.next;
            }else{
                prev.next = c2;
                c2=c2.next;
            }
             prev = prev.next;
        }
         
        prev.next = c1!=null?c1:c2;
         return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        // int si = 0;
        // int ei  = lists.length-1;
        return ans(lists, 0 , lists.length-1);
    }
    public ListNode ans(ListNode[]lists  , int si , int ei){
        if(si>ei)return null;
        if(si==ei)return lists[si];
        int mid = (si+ei)/2;
        ListNode l1= ans(lists , si , mid);
        ListNode l2  = ans(lists , mid+1,  ei);
        return mergeList(l1,l2);
    }
}

// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
//         ListNode temp=new ListNode(-1);
//         PriorityQueue<ListNode> queue = new PriorityQueue<>((o1,o2)->o1.val-o2.val);
//         for(ListNode node:lists) {
//             if(node!=null) {
//                 queue.add(node);                
//             }
//         }
//         ListNode dummy = temp;
//         while(!queue.isEmpty()) {
//             temp.next=queue.poll();
//             temp=temp.next;
//             if(temp.next!=null) {
//                 queue.add(temp.next);
//             }
//         }
        
//         return dummy.next;
//     }
// }