def reverseList(head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prev, nxt = None, None
        while head:
            nxt = head.next
            head.next = prev
            prev = head
            head = nxt
            
        return prev