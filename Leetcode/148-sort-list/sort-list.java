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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        int arr[]=new int[c];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i]=temp.val;
            temp=temp.next;
            i++;
        }
        Arrays.sort(arr);
        ListNode h1=new ListNode(0);
        temp=h1;
        for(i=0;i<c;i++){
            ListNode t=new ListNode(arr[i]);
            temp.next=t;
            temp=t;
        }
        return h1.next;

    }
}