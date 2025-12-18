/*
Problem Description

You are given a singly linked list and an integer K.
Your task is to access the node at the K-th index (0-based indexing)
in the list and return its value.

If the index is out of bounds, return -1.

Problem Constraints
  K <= 10^6

Input Format
  The first argument is a pointer to the head of the linked list.
  The second argument is a positive integer K.

Output Format
  Return a single integer representing the value of the K-th node
  in the linked list.

Example Input
  1 -> 3 -> 5 -> 7 -> 9
  K = 2

Example Output
  5

Example Explanation
  The element at index 2 (0-based indexing) is 5,
  which is the 3rd element in the linked list.
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
    public int solve(ListNode A, int B) {
        ListNode temp = A;
        int i=0;
        while(i<B && temp != null){
            i++;
            temp = temp.next;
        }
        if(temp == null){
            return -1;
        }
        return temp.val;
    }
}
