/*
Problem Description

Given a Binary Search Tree (BST) A, check whether there exists a node
with value B in the BST.


Problem Constraints

1 <= number of nodes in the binary tree <= 10^5
0 <= B <= 10^6


Input Format

The first argument is the root node of the binary tree A.
The second argument is an integer B.


Output Format

Return 1 if a node with value B exists in the BST, else return 0.


Example Input

Input 1:
                15
              /    \
            12      20
            / \    /  \
           10  14  16  27
          /
         8

B = 16

Input 2:
                8
               / \
              6   21
             / \
            1   7

B = 9


Example Output

Output 1:
1

Output 2:
0


Example Explanation

Explanation 1:
A node with value 16 exists in the Binary Search Tree.

Explanation 2:
There is no node with value 9 in the Binary Search Tree.
*/
