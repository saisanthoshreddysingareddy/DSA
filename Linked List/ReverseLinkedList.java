/*
Problem Description

You are given a singly linked list with head node A.
Your task is to reverse the linked list and return the head node
of the reversed list.

NOTE:
  - The reversal must be done in-place.
  - The solution must be completed in a single pass.

Problem Constraints
  1 <= length of the linked list <= 10^5
  Value of each node is within the range of a 32-bit integer.

Input Format
  The first and only argument is a linked list node A.

Output Format
  Return the head node of the reversed linked list.

Example Input

Input 1:
  A = 1 -> 2 -> 3 -> 4 -> 5 -> NULL

Input 2:
  A = 3 -> NULL

Example Output

Output 1:
  5 -> 4 -> 3 -> 2 -> 1 -> NULL

Output 2:
  3 -> NULL

Example Explanation

Explanation 1:
  The linked list has 5 nodes.
  After reversing, the list becomes:
    5 -> 4 -> 3 -> 2 -> 1 -> NULL

Explanation 2:
  The linked list consists of a single node.
  After reversing, the list remains:
    3 -> NULL
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
    public ListNode reverseList(ListNode A) {
        ListNode curr = A;
        ListNode prev = null;
        while(curr != null){
            ListNode currNext = curr.next; //2
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        return prev;
    }
}
