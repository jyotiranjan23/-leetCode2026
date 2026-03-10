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
    public ListNode oddEvenList(ListNode head) {
        if(head== null || head.next == null) return head;
        ListNode temp = head;
        ListNode result = new ListNode(head.val);
        ListNode resultNode = result;
        while(temp != null && temp.next!= null && temp.next.next != null){
            temp = temp.next.next;
            result.next = new ListNode(temp.val);
            result = result.next;
        }
        temp = head.next;
        while(temp != null && temp.next!= null){
            result.next = new ListNode(temp.val);
            temp = temp.next.next;
            result = result.next;
        }
        if(temp != null)
        result.next = new ListNode(temp.val);
        
        
        return resultNode;
    }
}