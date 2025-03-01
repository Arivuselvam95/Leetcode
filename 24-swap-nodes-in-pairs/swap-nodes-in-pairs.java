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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null && temp.next!=null){
            ListNode first = temp;
            ListNode second = temp.next;
            first.next = second.next;
            second.next = first;
            if(prev!=null){
                prev.next = second;
            }else{
                head = second;
            }
            prev = first;
            temp = first.next;
        }
        return head;
    }
}