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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode t1=new ListNode();
        ListNode head1=t1;
        ListNode t2=new ListNode();
        ListNode head2=t2;
        
        while(temp!=null){
            if(temp.val<x){
                head1.next=temp;
                temp=temp.next;
                head1=head1.next;
                head1.next=null;
            }
            else{
                head2.next=temp;
                temp=temp.next;
                head2=head2.next;
                head2.next=null;
            }
        }
        head1.next=t2.next;
        return t1.next;
    }
}