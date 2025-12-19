/*
Problem Description

Given a singly linked list A and an integer B, reverse the nodes of the list
B at a time and return the modified linked list.

Problem Constraints
  1 <= |A| <= 10^3
  B always divides |A|

Input Format
  The first argument contains a pointer to the head of the linked list A.
  The second argument contains the integer B.

Output Format
  Return a pointer to the head of the modified linked list.

Example Input

Input 1:
  A = [1, 2, 3, 4, 5, 6]
  B = 2

Input 2:
  A = [1, 2, 3, 4, 5, 6]
  B = 3

Example Output

Output 1:
  [2, 1, 4, 3, 6, 5]

Output 2:
  [3, 2, 1, 6, 5, 4]

Example Explanation

Explanation 1:
  The list is divided into groups of 2:
    [[1, 2], [3, 4], [5, 6]]
  After reversing each group:
    [[2, 1], [4, 3], [6, 5]]

Explanation 2:
  The list is divided into groups of 3:
    [[1, 2, 3], [4, 5, 6]]
  After reversing each group:
    [[3, 2, 1], [6, 5, 4]]
*/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        if (A == null || B <= 1) return A;

        ListNode dummy = new ListNode(0);
        dummy.next = A;

        ListNode prevTail = dummy;
        ListNode start = A;

        while (start != null) {
            // find the end of the current block
            ListNode end = start;
            int count = 1;
            while (count < B && end.next != null) {
                end = end.next;
                count++;
            }

            if (count < B) {
                // less than B nodes left  don't reverse
                prevTail.next = start;
                break;
            }

            ListNode stop = end.next;

            // reverse this block
            ListNode revHead = reverseBPart(start, stop);

            // connect previous block to this reversed block
            prevTail.next = revHead;

            // connect tail of this block to next part
            start.next = stop;

            // move prevTail and start forward
            prevTail = start;
            start = stop;
        }

        return dummy.next;
    }

    public ListNode reverseBPart(ListNode start, ListNode stop) {
        ListNode curr = start;
        ListNode prev = null;
        while (curr != stop) {
            ListNode agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev; // new head of this reversed block
    }
}
