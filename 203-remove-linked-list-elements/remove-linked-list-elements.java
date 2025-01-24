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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode tptr = dummy;
        while(tptr.next!=null){
            if(tptr.next.val == val)
                tptr.next = tptr.next.next;
            else
                tptr=tptr.next;
        }
        return dummy.next;
    }
}