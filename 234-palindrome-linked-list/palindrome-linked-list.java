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
    public boolean isPalindrome(ListNode head) {
        ListNode leftHalf = head;
        ListNode rightHalf = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        rightHalf = slow.next;
        rightHalf = reverse(rightHalf);
        slow.next = null;
        while(leftHalf != null && rightHalf != null){
            if(leftHalf.val != rightHalf.val) return false;
            leftHalf = leftHalf.next;
            rightHalf = rightHalf.next;
        }
        return true;


    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)
        return head;

    ListNode prev = null;
    ListNode curr = head;

    while(curr != null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;

    }
}