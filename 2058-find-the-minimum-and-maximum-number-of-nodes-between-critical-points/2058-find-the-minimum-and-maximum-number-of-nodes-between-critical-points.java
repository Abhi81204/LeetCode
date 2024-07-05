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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next == null || head.next.next == null) return new int[] {-1,-1};
        ListNode prePtr = head;
        ListNode ptr = head.next;
        ListNode postPtr = head.next.next;
        int first_c = -1, prev_c= -1, i = 1, dist = Integer.MAX_VALUE;
        while(postPtr!=null) {
            if((ptr.val>prePtr.val && ptr.val>postPtr.val) || (ptr.val<prePtr.val && ptr.val<postPtr.val)) {
                if(first_c==-1) first_c=i;
                else dist = Math.min(dist, i-prev_c);
                prev_c =i;
            }
            i++;
            prePtr = ptr;
            ptr = postPtr;
            postPtr = postPtr.next; 
        }
        if(dist == Integer.MAX_VALUE) return new int[] {-1, -1};
        else return new int[] {dist, prev_c-first_c};
        
    }
}