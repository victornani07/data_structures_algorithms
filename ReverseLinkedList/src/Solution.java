public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, newList = null;

        while(curr != null) {
            if(newList == null)
                newList = new ListNode(curr.val, null);
            else {
                ListNode node = new ListNode(curr.val, newList);
                newList = node;
            }
            curr = curr.next;
        }

        return newList;
    }
}
