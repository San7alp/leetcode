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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null){
            return null;
        }
        Stack<ListNode>stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        for(int i=0;i<n;i++){
            temp=stack.pop();
        }
        ListNode curr;
        if(temp==head){
            curr=head.next;
            temp.next=null;
            return curr;
        }
        curr=stack.pop();
        curr.next=temp.next;
        temp.next=null;
    return head;
    }
}