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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new  ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int c = 0;
        while(temp.next!=null){
            temp = temp.next;
            c++;
       }
       for(int i = 0;i<k;i++){
        slow = slow.next;
       }
       int p = c-k+1;
       for(int i = 0 ;i<p;i++){
         fast = fast.next;
       
       }    
        int dup = slow.val; //2
        slow.val = fast.val;
        fast.val = dup;

return dummy.next;
        
    }
}