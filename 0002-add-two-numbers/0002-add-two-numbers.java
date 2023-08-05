class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        try {
            ListNode customHead = new ListNode(0);
            ListNode current = customHead;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {
                int x = (l1 != null) ? l1.val : 0;
                int y = (l2 != null) ? l2.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                current.next = new ListNode(sum % 10);
                current = current.next;

                if (l1 != null)
                    l1 = l1.next;

                if (l2 != null)
                    l2 = l2.next;
            }

            return customHead.next;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
