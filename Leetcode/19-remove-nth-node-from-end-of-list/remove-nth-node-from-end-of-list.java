class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;

        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        for (int i = 0; i < n; i++) {
            temp = stack.pop();
        }
        if (stack.isEmpty()) {
            return head.next;
        }
        ListNode prev = stack.pop();
        prev.next = temp.next;

        return head;
    }
}
