/*
Problem Description

Given a binary tree of integers denoted by root A. Return an array of
integers representing the right view of the binary tree.

The right view of a binary tree is the set of nodes visible when the
tree is viewed from the right side.


Problem Constraints

1 <= number of nodes in the binary tree <= 100000
0 <= node values <= 10^9


Input Format

The first and only argument is the root node of the binary tree A.


Output Format

Return an integer array representing the right view of the binary tree.


Example Input

Input 1:
                1
              /   \
             2     3
            / \   / \
           4   5 6   7
          /
         8

Input 2:
                1
               / \
              2   3
               \
                4
                 \
                  5


Example Output

Output 1:
[1, 3, 7, 8]

Output 2:
[1, 3, 4, 5]


Example Explanation

Explanation 1:
The right view consists of the rightmost node at each level of the
binary tree.

Explanation 2:
The right view consists of the rightmost node at each level of the
binary tree.
*/
