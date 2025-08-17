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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
         int c=0;
        while(t1!=null||t2!=null){
            int d1=0;int d2=0;
            if(t1!=null){
                d1=t1.val;
                t1=t1.next;
                
            }
            
            if(t2!=null){
                d2=t2.val;
                t2=t2.next;
                
            }
            int sum=d1+d2+c;
                c=sum/10;
                sum=sum%10;
            curr.next=new ListNode(sum);
            curr=curr.next;
                      
        }
        if (c > 0) {
                curr.next = new ListNode(c);
            } 
        return dummy.next;
    }
}