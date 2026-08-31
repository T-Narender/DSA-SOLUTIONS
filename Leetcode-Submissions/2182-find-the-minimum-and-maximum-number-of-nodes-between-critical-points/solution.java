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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDist = Integer.MAX_VALUE;

        ListNode prev = head;
        ListNode curr = head.next;
        int currPos = 1;
        int prevCriticalIdx = 0;
        int firstCrtiticalIdx = 0;

        while(curr.next!=null){
            if((curr.val < prev.val && curr.val < curr.next.val) ||
                (curr.val > prev.val && curr.val > curr.next.val)){
                if(prevCriticalIdx==0){
                    prevCriticalIdx=currPos;
                    firstCrtiticalIdx=currPos;
                }else{
                    minDist = Math.min(minDist,currPos-prevCriticalIdx);
                    prevCriticalIdx = currPos;
                }
            }
            currPos++;
            prev = curr;
            curr = curr.next;
        }
        if(minDist == Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }

        int maxDist = prevCriticalIdx - firstCrtiticalIdx;
        return new int[]{minDist,maxDist};
    }
}
