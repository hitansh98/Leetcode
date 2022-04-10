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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next ==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode ptr1 = dummy;
        ListNode ptr2 = dummy;
        ListNode startNode = dummy;

        while(head != null){
            if(head.val >= x){
                if(ptr2==dummy){
                    startNode = head;
                    ptr2 = head;
                }
                else{
                    ptr2.next = head;
                    ptr2 = ptr2.next;
                }
            } 
            else{
                ptr1.next = head;
                ptr1 = ptr1.next;
            }
            head = head.next;
        }

        if(ptr2!=dummy){
            ptr2.next = null;
            ptr1.next = startNode;
        }
        return dummy.next;
    }
}