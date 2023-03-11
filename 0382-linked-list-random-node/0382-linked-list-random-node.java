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
    int totalLen = 0;
    ListNode ll;

    public Solution(ListNode head) {
        ll = head;
        ListNode temp = head;
        while(temp!=null){
            totalLen += 1;
            temp = temp.next;
        }
    }
    
    public int getRandom() {
        ListNode temp = this.ll;
        if(this.totalLen == 1){
            return temp.val;
        }
        int num = (int)(Math.random() * this.totalLen);
        // System.out.println(num);
        while(num>0){
            temp = temp.next;
            num--;
        }
        
        return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */