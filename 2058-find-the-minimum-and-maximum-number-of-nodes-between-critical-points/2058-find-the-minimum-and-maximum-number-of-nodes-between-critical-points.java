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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first = -1;
        int ptr1 = -1;
        int ptr2 = -1;
        ListNode temp = head;
        ListNode prev = head;
        temp = temp.next;
        int index = 1;
        int minTillNow = Integer.MAX_VALUE;
        while(temp != null && temp.next != null) {
            if(isCriticalNode(prev, temp)) {
                if(first != -1) {
                    ptr2 = ptr1;
                    ptr1 = index;
                    minTillNow = Math.min(minTillNow, ptr1 - ptr2);
                } else {
                    first = index;
                    ptr1 = index;
                }
            }
            index++;
            prev = temp;
            temp = temp.next;
        }
        
        if(ptr2 == -1 || first == -1) {
            return new int[]{-1, -1};
        }
        
        return new int[]{minTillNow, ptr1 - first};
        
    }
    
    public boolean isCriticalNode(ListNode prev, ListNode head) {
        if((prev.val < head.val && head.val > head.next.val) || (prev.val > head.val && head.val < head.next.val)) {
            return true;
        }
        return false;
    }
}