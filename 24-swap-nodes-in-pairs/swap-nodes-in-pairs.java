class Solution {
    public ListNode swapPairs(ListNode head) {
        // Dummy node simplifies edge cases when swapping the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Loop as long as there is a pair to swap
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = prev.next.next;

            // Perform the swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev two steps forward for the next pair
            prev = first;
        }

        return dummy.next;
    }
}