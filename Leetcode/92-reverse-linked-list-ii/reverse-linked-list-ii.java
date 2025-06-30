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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if (head == null||left == right){
         return head;
         }
         ListNode dummy = new ListNode(0); 
        dummy.next = head;
        ListNode t=dummy;
        ListNode t1=dummy;
       int c=1;
        for(c=1;c<left;c++){
            t1=t1.next;
        }
        c=0;
        
        ListNode curr=t1.next;
        ListNode prev=t1;
        
        while(c!=right-left){
            ListNode temp=curr.next;     
            curr.next=temp.next;          
            temp.next=prev.next;           
            prev.next=temp;

            c++;
        }
        return t.next;



        
    }
}