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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode list3=new ListNode();
        ListNode temp=list3;
        ListNode s1=list1;
        ListNode s2=list2;
        while(s1!=null&&s2!=null){
            if(s1.val<=s2.val){
                temp.next=s1;
                s1=s1.next;
                temp=temp.next;
            }
            else{
                temp.next=s2;
                s2=s2.next;
                temp=temp.next;
            }
        }
        while(s1!=null){
            temp.next=s1;
            s1=s1.next;
            temp=temp.next;
        }
        while(s2!=null){
            temp.next=s2;
            s2=s2.next;
            temp=temp.next;
        } 
        return list3.next;  
    }
}