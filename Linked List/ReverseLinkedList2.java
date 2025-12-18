/*
Problem Description

Reverse a linked list A from position B to position C.

NOTE:
  - Perform the operation in-place.
  - Complete the task in a single pass.

Problem Constraints
  1 <= |A| <= 10^6
  1 <= B <= C <= |A|

Input Format
  The first argument contains a pointer to the head of the linked list A.
  The second argument contains an integer B.
  The third argument contains an integer C.

Output Format
  Return a pointer to the head of the modified linked list.

Example Input

Input 1:
  A = 1 -> 2 -> 3 -> 4 -> 5
  B = 2
  C = 4

Input 2:
  A = 1 -> 2 -> 3 -> 4 -> 5
  B = 1
  C = 5

Example Output

Output 1:
  1 -> 4 -> 3 -> 2 -> 5

Output 2:
  5 -> 4 -> 3 -> 2 -> 1

Example Explanation

Explanation 1:
  The sublist from position 2 to 4 is reversed:
    1 -> 2 -> 3 -> 4 -> 5
         ^     ^
  Resulting list:
    1 -> 4 -> 3 -> 2 -> 5

Explanation 2:
  The entire list from position 1 to 5 is reversed:
    1 -> 2 -> 3 -> 4 -> 5
  Resulting list:
    5 -> 4 -> 3 -> 2 -> 1
*/
