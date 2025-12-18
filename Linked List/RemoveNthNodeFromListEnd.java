/*
Problem Description

Given a linked list A, remove the B-th node from the end of the list
and return its head.

For example, given the linked list:
  1 -> 2 -> 3 -> 4 -> 5
and B = 2

After removing the second node from the end, the linked list becomes:
  1 -> 2 -> 3 -> 5

NOTE:
  - If B is greater than the size of the list, remove the first node.
  - Try to solve the problem using constant additional space.

Problem Constraints
  1 <= |A| <= 10^6

Input Format
  The first argument contains a pointer to the head of the linked list A.
  The second argument contains the integer B.

Output Format
  Return the head of the linked list after deleting the B-th node
  from the end.

Example Input

Input 1:
  A = 1 -> 2 -> 3 -> 4 -> 5
  B = 2

Input 2:
  A = 1
  B = 1

Example Output

Output 1:
  1 -> 2 -> 3 -> 5

Output 2:
  NULL

Example Explanation

Explanation 1:
  The second node from the end is 4, which is removed.

Explanation 2:
  The list contains only one node, which is removed.
*/
