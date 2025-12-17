/*
Problem Description

You are given A, which is the head of a linked list.
You are also given an integer B and a position C.

Your task is to insert a new node with value B at position C
in the linked list and return the head of the updated list.

Notes:
  - If the position C is greater than the length of the linked list,
    insert the new node at the tail.
  - If the position C is 0, insert the new node at the head.
  - Follow 0-based indexing for node positions.

Problem Constraints
  0 <= size of linked list <= 10^5
  1 <= value of nodes <= 10^9
  1 <= B <= 10^9
  0 <= C <= 10^5

Input Format
  The first argument A is the head of the linked list.
  The second argument B is the value of the new node.
  The third argument C is the position at which the new node is to be inserted.

Output Format
  Return the head of the updated linked list.

Example Input

Input 1:
  A = 1 -> 2
  B = 3
  C = 0

Input 2:
  A = 1 -> 2
  B = 3
  C = 1

Example Output

Output 1:
  3 -> 1 -> 2

Output 2:
  1 -> 3 -> 2

Example Explanation

Explanation 1:
  The new node is added at the head of the linked list.

Explanation 2:
  The new node is added after the first node of the linked list.
*/
