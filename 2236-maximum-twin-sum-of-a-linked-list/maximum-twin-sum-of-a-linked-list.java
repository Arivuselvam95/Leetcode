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
    public int pairSum(ListNode head) {
        ListNode rev = null;
        ListNode temp = head;
        while(temp!=null){
            ListNode n = new ListNode(temp.val);
            n.next = rev;
            rev = n;
            temp=temp.next;            
        }
        temp=head;
        int max=0;
        while(temp!=null){
            int sum = rev.val + temp.val;
            max = max < sum ? sum : max;
            temp = temp.next;
            rev=rev.next;
        }
        return max;
    }
}