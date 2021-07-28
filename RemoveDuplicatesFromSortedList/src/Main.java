public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, null)));

        for(ListNode p = solution.deleteDuplicates(head); p != null; p = p.next)
            System.out.println(p.val);
    }
}
