public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head, prev = head;

        while (temp != null) {
            if(temp.val != prev.val) {
                prev.next = temp;
                prev = temp;
            }

            temp = temp.next;
        }

        if(prev != temp)
            prev.next = null;

        return head;
    }
}
