public class RotateRight {

    //Implement a list node so that the function may work for list of any object type
    public class ListNode implements Comparable<ListNode> {
        public int val;
        public ListNode next = null;

        public ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return val + (next == null ? "" : ", " + next.toString());
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof ListNode)) {
                return false;
            } else {
                ListNode other = (ListNode) obj;
                return toString().equals(other.toString());
            }
        }

        @Override
        public int compareTo(ListNode other) {
            return val - other.val;
        }
    }


    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        int length = 1;
        ListNode fast = head;
        while (fast.next != null) {
            length++;
            fast = fast.next;
        }

        ListNode slow = head;
        for (int remain = length - k % length; remain > 1; remain--) {
            slow = slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}
