/*
Problem Description

Given a sorted linked list, delete all duplicates such that
each element appears only once.

Problem Constraints
  0 <= length of linked list <= 10^6

Input Format
  The first argument is the head pointer of the linked list.

Output Format
  Return the head pointer of the linked list after removing
  all duplicate elements.

Example Input

Input 1:
  1 -> 1 -> 2

Input 2:
  1 -> 1 -> 2 -> 3 -> 3

Example Output

Output 1:
  1 -> 2

Output 2:
  1 -> 2 -> 3

Example Explanation

Explanation 1:
  After removing duplicates, each element appears only once,
  resulting in the linked list:
    1 -> 2
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
    public ListNode deleteDuplicates(ListNode A) {
        ListNode curr = A;
        ListNode prev = A;
        while(curr != null){
            if(curr.val == prev.val){
                curr = curr.next;
            }else{
                prev.next = curr;
                prev = prev.next;
            }
        }
        prev.next = null;
        return A;
    }
}
