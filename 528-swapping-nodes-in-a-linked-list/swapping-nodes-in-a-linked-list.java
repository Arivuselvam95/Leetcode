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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode first = null;
        ListNode second = null;
        int count = 0;
        while(temp!=null){
            count++;
            if(count == k)
                first = temp;
            temp = temp.next;
        }
        temp = head;
        int c = count - k;
        count = 0;
        while(temp!=null){
            if(count == c)
                second = temp;
            temp = temp.next;
            count++;
        }
        int t = first.val;
        first.val = second.val;
        second.val = t;
        return head;
    }
}