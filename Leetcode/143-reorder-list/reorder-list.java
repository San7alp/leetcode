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
    public void reorderList(ListNode head) {
        Stack<ListNode>stack=new Stack<>();
        if(head==null||head.next==null){
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        temp=head;
        int n1=stack.size();
        for(int i=0;i<n1/2;i++){
            ListNode n=temp.next;
            ListNode m=stack.pop();
            temp.next=m;
            m.next=n;
            temp=n;
        }
        
        temp.next=null;
    }
}