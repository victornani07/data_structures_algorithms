public class Main {
    public static void print(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, null);
        ListNode node2 = new ListNode(2, null);
        ListNode node3 = new ListNode(2, null);
        ListNode node4 = new ListNode(2, null);
        ListNode node5 = new ListNode(2, null);
        ListNode node6 = new ListNode(3, null);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Solution solution = new Solution();

        print(solution.removeElements(node1, 2));
    }
}
