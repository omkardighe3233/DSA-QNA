 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; 
 this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
            prev = first;
        ListNode prev = dummy;
            ListNode second = first.next;

            prev.next = second;




        while (prev.next != null && prev.next.next != 
            ListNode first = prev.next;
            first.next = second.next;
            second.next = first;
        }

        return dummy.next;
        null) {
    }
}
