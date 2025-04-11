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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode t1 = l1;
        ListNode t2 = l2;
        while(t1!=null || t2!=null){
            if(t1!=null){
                stack1.push(t1.val);
                t1 = t1.next;
            }
            if(t2!=null){
                stack2.push(t2.val);
                t2 = t2.next;
            }
        }
        int carry = 0;
        ListNode res = null;
        while(!stack1.isEmpty()||!stack2.isEmpty()||carry!=0){
            int ans =carry;
            if(!stack1.isEmpty())
                ans+=stack1.pop();
            if(!stack2.isEmpty())
                ans+=stack2.pop();
            if(ans>9)
                carry = 1;
            else
                carry = 0;
            if(res==null){
                res = new ListNode(ans%10);
            }else{
                ListNode cur = new ListNode(ans%10);
                cur.next = res;
                res = cur;
            }

        }
        return res;
    }
}