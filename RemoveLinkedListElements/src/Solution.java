public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head, prev = head;

        while(curr != null)
            if(head.val == val) {
                head = head.next;
                curr = head;
                prev = head;
            } else {
                if (curr.val == val) {
                    prev.next = curr.next;
                    curr = prev.next;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }

        return head;
    }
}
