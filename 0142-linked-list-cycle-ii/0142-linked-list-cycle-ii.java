/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        
        boolean flag = true;
        
        
        while(ptr2!=null && ptr2.next!=null && ptr1!=null && (flag || ptr1!=ptr2)){
            flag = false;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        
        // System.out.println(ptr1.val+" "+ptr2.val);
        
        if(ptr1!=ptr2){
            return null;
        }
        
        
        ptr1 = head;
        
        while(ptr1!=ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        // System.out.println(ptr1.val+" "+ptr2.val);
        
        return ptr1;
        
    }
    
}