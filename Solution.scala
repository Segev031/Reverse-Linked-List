object Solution {
    def reverseList(head: ListNode): ListNode = {
        if (head == null) return head;
        var current: ListNode = head;
        var prev: ListNode = null;
        var nxt: ListNode = null;
        while (current != null) {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }
}