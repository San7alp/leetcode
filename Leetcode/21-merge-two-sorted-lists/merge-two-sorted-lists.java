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
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode s1=list1;
        ListNode s2=list2;
        ListNode s3=new ListNode();
        ListNode temp=s3;
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
        if(s1!=null){
            temp.next=s1;
        }
        if(s2!=null){
            temp.next=s2;
        }
        return s3.next;
    }
}