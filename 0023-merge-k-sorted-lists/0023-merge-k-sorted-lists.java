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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        
        if(lists.length==1){
            return lists[0];
        }
        PriorityQueue<ListNode> pq = new PriorityQueue(new QueueComparator());
        
        for(ListNode node: lists){
            if(node!=null){
                pq.add(node);
            }   
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        while(!pq.isEmpty()){
            ListNode top = pq.poll();
            
            temp.next = top;
            temp = temp.next;
            
            if(top.next != null){
                pq.add(top.next);    
            }
        }
        
        return dummy.next;
    }
}

class QueueComparator implements Comparator<ListNode>{
    
    //@override
    public int compare(ListNode n1, ListNode n2){
        return n1.val - n2.val;
    }
}