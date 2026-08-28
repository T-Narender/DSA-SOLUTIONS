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
        ListNode fast = head;
        ListNode slow = head;

        for(int i=1;i<k;i++){
            fast = fast.next;
        }
        ListNode target1 = fast;

        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode target2 = slow;

        int temp = target1.val;
        target1.val = target2.val;
        target2.val = temp;

        return head;
    }
    
}
