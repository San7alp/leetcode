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
    public ListNode mergeKLists(ListNode[] lists) {
            ListNode s1=null;
        for(int i=0;i<lists.length;i++){
            s1=merge(s1,lists[i]);
        }
        return s1;
    }
    public ListNode merge(ListNode s1,ListNode s2){
        ListNode temp1=s1;
        ListNode temp2=s2;
        ListNode s3=new ListNode();
        ListNode temp3=s3;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<=temp2.val){
                temp3.next=temp1;
                temp1=temp1.next;
                temp3=temp3.next;
            }
            else{
                temp3.next=temp2;
                temp2=temp2.next;
                temp3=temp3.next;
            }
        }
        if(temp1!=null) temp3.next=temp1;
        if(temp2!=null) temp3.next=temp2;
        return s3.next;
    }
}