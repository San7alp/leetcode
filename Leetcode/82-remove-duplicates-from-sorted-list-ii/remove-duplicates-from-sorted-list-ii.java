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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode prev=temp;
        ListNode curr=head;
        while(curr!=null){
            while(curr.next!=null&&curr.next.val==curr.val){
                curr=curr.next;
            }
            if(prev.next==curr){
                prev=curr;
            }
            else{
                prev.next=curr.next;
                // prev=curr.next;
            }
            curr=curr.next;
        }
        return temp.next;
    }
}