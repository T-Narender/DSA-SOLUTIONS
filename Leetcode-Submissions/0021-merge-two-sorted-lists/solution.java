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
    public ListNode mergesort(ListNode head){
        if(head==null && head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode rightHead=mid.next;
        mid.next=null;
        ListNode list1=mergesort(head);
        ListNode list2=mergesort(rightHead);
        return mergeTwoLists(list1,list2);
    }
    public ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedLL=new ListNode(-1);
        ListNode temp=mergedLL;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }
            else{
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
            }
             
        }
        while(list1!=null){
            temp.next=list1;
            list1=list1.next;
            temp=temp.next;
        }
        while(list2!=null){
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    
}
