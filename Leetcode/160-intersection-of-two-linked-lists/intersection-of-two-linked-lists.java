/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=0;int c2=0;
        ListNode temp=headA;
        while(temp!=null){
            temp=temp.next;
            c1++;
        }
        temp=headB;
        while(temp!=null){
            temp=temp.next;
            c2++;
        }
        temp=headA;
        ListNode temp1=headB;
        if(c1<c2){
            int x=c2-c1;
            while(x>0){
                temp1=temp1.next;
                x--;
            }
        }
        else{
            int x=c1-c2;
            while(x>0){
                temp=temp.next;
                x--;
            }
        }
        while(temp!=null&&temp1!=null&&temp!=temp1){
            temp=temp.next;
            temp1=temp1.next;
        }
        if(temp==temp1){return temp;}
        return null;
    }
}