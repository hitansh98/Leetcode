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
    public void reorderList(ListNode head) {
        //find mid of list
        
        if(head==null) return;
        if(head.next==null) return;
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        
        ListNode prev = null;
        
        while(ptr2!=null && ptr2.next!=null){
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        
        if(prev!=null){
            prev.next = null;
        }
        
        //reverse list after mid of list
        prev = null;
        
        while(ptr1!=null){
            ListNode nextStore = ptr1.next;
            ptr1.next = prev;
            prev = ptr1;
            ptr1 = nextStore;
        }
        
        
        //Iterate first and last and interchange
        ptr1 = head;
        ptr2 = prev;
        
        while(ptr1!=null && ptr2!=null){
            ListNode nextStore = ptr1.next;
            ptr1.next = ptr2;
            ptr1 = ptr2;
            ptr2 = nextStore;
            
        }
        
    }
}