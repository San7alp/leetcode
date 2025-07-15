class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;

        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        // Push all nodes to the stack
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        // Pop n nodes to get to the one before the node to remove
        for (int i = 0; i < n; i++) {
            temp = stack.pop();
        }

        // If stack is empty, we removed the head
        if (stack.isEmpty()) {
            return head.next;
        }

        // Bypass the node to be removed
        ListNode prev = stack.pop();
        prev.next = temp.next;

        return head;
    }
}
