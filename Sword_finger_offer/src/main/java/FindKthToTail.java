public class FindKthToTail {
    public class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode fast=null, slow=null;
        fast = head;
        slow = head;
        int a = k;
        int count = 0;

        while (fast != null) {
            fast = fast.next;
            count++;
            if (k < 1) {
                slow = slow.next;
            }
            k--;
        }
        if (count < a) {
            return null;
        }
        return slow;
    }
}
