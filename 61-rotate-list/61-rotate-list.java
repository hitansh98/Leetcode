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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next == null || k==0) return head;
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;
        ListNode temp = dummy;
        
        ListNode l = dummy;
        // ListNode r = dummy;
        
        int count = 0;
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
        // System.out.println(k+" "+count);
        
        if(count==k){
            return head;
        }
        else if(count<k){
            k = k%count;
        }
        
        if(k==0){
            return head;
        }
        for(int i=0;i<count-k;i++){
            l = l.next;
        }
            
        head = l.next;
        ListNode r = l.next;
        l.next = null;
            
        while(r.next!=null){
            r= r.next;
        }
        // System.out.println("Last Node: "+r.val);
        r.next = dummy.next; 
        return head;
    }
}