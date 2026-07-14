/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode temp = head;
        int i=0;
        while(temp != null )
        {
           i++;
           temp = temp.next;
        }
        if(n == i)
        {
            head = head.next;
            return head;
        }
        temp = head;
        n = i-n;
        i=1;
        
        while(i != n )
        {
            i++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}