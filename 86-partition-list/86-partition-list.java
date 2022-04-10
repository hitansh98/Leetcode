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

        ListNode temp = head;

        while(temp != null){
            if(temp.val >= x){
                if(ptr2==dummy){
                    startNode = temp;
                    ptr2 = temp;
                }
                else{
                    ptr2.next = temp;
                    ptr2 = ptr2.next;
                }
            } 
            else{
                ptr1.next = temp;
                ptr1 = ptr1.next;
            }
            temp = temp.next;
            // System.out.println(ptr1.val+"  "+ptr2.val+"  "+startNode.val);
        }
        // System.out.println("updated:  "+ptr1.val+"  "+ptr2.val+"  "+startNode.val+"  "+dummy.next.val);
        if(ptr2!=dummy){
            ptr2.next = null;
            ptr1.next = startNode;
        }
        return dummy.next;
    }
}