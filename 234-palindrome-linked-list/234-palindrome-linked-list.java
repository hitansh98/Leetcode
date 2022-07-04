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