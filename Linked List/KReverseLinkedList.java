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
