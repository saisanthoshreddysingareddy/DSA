/*
Problem Description

You are given A, which is the head of a linked list.
Print the linked list in a space-separated manner.

Note:
  - The last node value must also be followed by a space.
  - After printing the entire list, print a new line.

Problem Constraints
  1 <= size of linked list <= 10^5
  1 <= value of nodes <= 10^9

Input Format
  The first argument A is the head of a linked list.

Output Format
  You do not need to return anything.

Example Input

Input 1:
  A = 1 -> 2 -> 3

Input 2:
  A = 4 -> 3 -> 2 -> 1

Example Output

Output 1:
  1 2 3 

Output 2:
  4 3 2 1 

Example Explanation

For Input 1:
  We print the given linked list.

For Input 2:
  We print the given linked list.
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
    public void solve(ListNode A) {
        ListNode temp = A;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
