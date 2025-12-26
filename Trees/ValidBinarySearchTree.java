/*
Problem Description

You are given a binary tree represented by root A. You need to check
whether it is a Binary Search Tree (BST) or not.

A Binary Search Tree is defined as follows:
1) The left subtree of a node contains only nodes with keys less than
   the node's key.
2) The right subtree of a node contains only nodes with keys greater
   than the node's key.
3) Both the left and right subtrees must also be Binary Search Trees.

Problem Constraints

1 <= number of nodes in the binary tree <= 10^5
0 <= node values <= 2^32 - 1

Input Format

The first and only argument is the root node of the binary tree A.


Output Format

Return 1 if the given tree is a Binary Search Tree, else return 0.

Example Input

Input 1:
        1
       / \
      2   3

Input 2:
        2
       / \
      1   3

Example Output

Output 1:
0

Output 2:
1

Example Explanation

Explanation 1:
Node 2 is in the left subtree of node 1 but is greater than 1,
which violates the Binary Search Tree property.

Explanation 2:
The given tree satisfies all the conditions of a Binary Search Tree.
*/
