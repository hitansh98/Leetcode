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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode additionNode = null;
        ListNode endNode = null;
        ListNode head = list1;
        int count = 1;
        while(list1!=null){
            
            if(count == a){
                additionNode = list1;
            }
            
            if (count == b+1){
                endNode = list1;
            }
            
            list1 = list1.next;
            count+=1;
        }
        
        additionNode.next = list2;
        
        while(list2.next!=null){
            list2 = list2.next;
        }
        
        list2.next = endNode.next;
        
        return head;
    }
}