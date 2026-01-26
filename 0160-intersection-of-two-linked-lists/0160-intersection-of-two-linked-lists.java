/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode>list = new HashSet<>();
        ListNode curr = headA;
        while(curr!=null){
            list.add(curr);
            curr = curr.next;
        }
        ListNode cur = headB;
        while(cur!=null){
            if(list.contains(cur)){
                return cur;
            }
            cur = cur.next;
        }
        return null;
       
    }
}