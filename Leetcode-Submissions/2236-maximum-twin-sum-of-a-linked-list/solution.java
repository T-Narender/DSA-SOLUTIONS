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
        ListNode mid = null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        mid = slow;
        //Reverse logic
        ListNode nxtNode = null;
        ListNode prev = null;
        while(mid!=null){
            nxtNode = mid.next;
            mid.next = prev;
            prev = mid;
            mid = nxtNode;
        }
        ListNode curr = head;
        int res = 0;
        while(prev!=null){
            res=Math.max(res,curr.val+prev.val);
            curr=curr.next;
            prev=prev.next;
        }
        return res;
    }
}
