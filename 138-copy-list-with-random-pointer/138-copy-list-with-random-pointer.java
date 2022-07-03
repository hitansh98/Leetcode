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
        
        
        Node node = head;
        while(node!=null){
            hm.put(node, new Node(node.val));
            node = node.next;
        }
        
        Node newNode = head;
        while(newNode != null){
            hm.get(newNode).next = hm.get(newNode.next);
            hm.get(newNode).random = hm.get(newNode.random);
            newNode = newNode.next;
        }
        
        return hm.get(head);
    }
}