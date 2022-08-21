class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode move = head;
        while (move != null) {
            stack.push(move.val);
            move = move.next;
        }
        ListNode list = new ListNode(0);
        move = list;
        while (!stack.isEmpty()) {
            move.next = new ListNode(stack.pop());
            move = move.next;
        }
        return list.next;
    }
}