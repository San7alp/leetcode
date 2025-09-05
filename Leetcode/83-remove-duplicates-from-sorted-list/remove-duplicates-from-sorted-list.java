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
        
        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
            if(temp.val==temp.next.val){
                ListNode temp1=temp.next;
                temp.next=temp1.next;
                temp1.next=null;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}