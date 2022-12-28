/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap<Node, Node>();
        Node tmp = head;
        
        while(tmp!=null){
            hm.put(tmp, new Node(tmp.val));
            tmp = tmp.next;
        }
        
        
        Node newTmp = head;
        
        while(newTmp !=null){
            hm.get(newTmp).next = hm.get(newTmp.next);
            hm.get(newTmp).random = hm.get(newTmp.random);
            newTmp = newTmp.next;
        }
        
        return hm.get(head);
        
    }
}