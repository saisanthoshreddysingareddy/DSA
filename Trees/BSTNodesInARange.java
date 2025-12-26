/*
Problem Description

Given a Binary Search Tree (BST) of integers, you are given a range B
and C. Return the count of the number of nodes that lie within the
given range [B, C].


Problem Constraints

1 <= number of nodes in the binary tree <= 100000
0 <= B <= C <= 10^9


Input Format

The first argument is the root node of the binary tree A.
The second argument is an integer B.
The third argument is an integer C.


Output Format

Return the count of the number of nodes that lie in the given range.


Example Input

Input 1:
                15
              /    \
            12      20
            / \    /  \
           10  14  16  27
          /
         8

B = 12
C = 20

Input 2:
                8
               / \
              6   21
             / \
            1   7

B = 2
C = 20


Example Output

Output 1:
5

Output 2:
3


Example Explanation

Explanation 1:
Nodes that lie in the range [12, 20] are:
[12, 14, 15, 16, 20].

Explanation 2:
Nodes that lie in the range [2, 20] are:
[6, 7, 8].
*/
