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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head==null){
            return null;
        }
        
        int count = countHelper(head);
        // System.out.println(count);
        
        return dfs(head, 0, count-1);
        
    }
    
    
    public TreeNode dfs(ListNode head, int left, int right){
        if(left > right){
            return null;
        }
        if(left == right){
            return new TreeNode(head.val);
        }
        
        int mid = left + (right-left)/2;
        ListNode temp = head;
        
        for(int i=left; i<mid; i++){
            temp = temp.next;
        }
        
        TreeNode treenode = new TreeNode(temp.val);
        treenode.left = dfs(head, left, mid-1);
        treenode.right = dfs(temp.next, mid+1, right);
        
        return treenode;
    }
    
//     public ListNode[] findMidOfLL(ListNode head){
//         ListNode ptr1 = head;
//         ListNode ptr2 = head;
//         ListNode prevNodeStore = null;
        
//         while(ptr2!=null && ptr2.next!=null){
//             ptr2 = ptr2.next.next;
            
//             ListNode nextNodeStore = ptr1.next;
//             ptr1.next = prevNodeStore;
//             prevNodeStore = ptr1;
//             ptr1 = nextNodeStore;
//         }
        
//         return new ListNode[]{prevNodeStore, ptr1};
//     }
    
    
    public int countHelper(ListNode head){
        int res = 0;
        while(head!=null){
            head = head.next;
            res+=1;
        }
        
        return res;
    }
}