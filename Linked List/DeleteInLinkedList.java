/*
Problem Description

You are given the head of a linked list A and an integer B.
Your task is to delete the B-th node from the linked list.

Note:
  - Follow 0-based indexing for node numbering.

Problem Constraints
  1 <= size of linked list <= 10^5
  1 <= value of nodes <= 10^9
  0 <= B < size of linked list

Input Format
  The first argument A is the head of the linked list.
  The second argument B is an integer representing the index
  of the node to be deleted.

Output Format
  Return the head of the linked list after deletion.

Example Input

Input 1:
  A = 1 -> 2 -> 3
  B = 1

Input 2:
  A = 4 -> 3 -> 2 -> 1
  B = 0

Example Output

Output 1:
  1 -> 3

Output 2:
  3 -> 2 -> 1

Example Explanation

Explanation 1:
  After deleting the node at index 1, the list becomes:
    1 -> 3

Explanation 2:
  After deleting the node at index 0, the list becomes:
    3 -> 2 -> 1
*/
