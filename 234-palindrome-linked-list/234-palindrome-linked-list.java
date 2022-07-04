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
    public boolean isPalindrome(ListNode head) {
        // return booleanMethod(head);
        
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        ListNode prevNodeStore = null;
        while(slowPtr !=null){
            ListNode nextNodeStore = slowPtr.next;
            slowPtr.next = prevNodeStore;
            prevNodeStore = slowPtr;
            slowPtr = nextNodeStore;
        }
        
        // ListNode ptr1 = head;
        while(head!=null && prevNodeStore!=null){
            if(head.val != prevNodeStore.val){
                return false;
            }
            else{
                head = head.next;
                prevNodeStore = prevNodeStore.next;
            }
        }
        
        return true;
        
    }
    
    public boolean booleanMethod(ListNode head){
        Stack<Integer> st = new Stack<Integer>();
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        while(fastPtr!=null && fastPtr.next!=null){
            st.push(slowPtr.val);
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        if(fastPtr!=null){
            slowPtr = slowPtr.next;
        }
        
        while(slowPtr!=null){
            if(slowPtr.val != st.peek()){
                return false;
            }
            else{
                st.pop();
                slowPtr = slowPtr.next;
            }
        }
        
        return true;
    }
}