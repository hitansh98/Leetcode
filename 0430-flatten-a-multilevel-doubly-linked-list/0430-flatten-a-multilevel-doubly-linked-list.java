/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        
        Node p = head;
        
        while(p!=null){
            if(p.child == null){
                p = p.next;
            }
            else{
                Node temp = p.child;
                while(temp.next!=null){
                    temp = temp.next;
                }
                
                temp.next = p.next;
                if(p.next!=null){
                    p.next.prev = temp;
                }
                
                p.next = p.child;
                p.next.prev = p;
                p.child = null;
                p = p.next;
            }
        }
        
        return head;
    }
}