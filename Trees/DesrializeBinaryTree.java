/*
Problem Description

You are given an integer array A denoting the level order traversal of a
binary tree.

You have to deserialize the given traversal into a binary tree and
return the root of the binary tree.

NOTE:
In the array, a NULL/None child is denoted by -1.
For more clarification, refer to the example inputs.


Problem Constraints

1 <= number of nodes <= 10^5
-1 <= A[i] <= 10^5


Input Format

The first and only argument is an integer array A denoting the level
order traversal of the binary tree.


Output Format

Return the root node of the binary tree.


Example Input

Input 1:
A = [1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1]

Input 2:
A = [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1]


Example Output

Output 1:
                1
              /   \
             2     3
            / \
           4   5

Output 2:
                1
              /   \
             2     3
            / \     \
           4   5     6


Example Explanation

Explanation 1:
Each element of the array represents the value of a node. If the value
is -1, it denotes a NULL/None child.
Since nodes 3, 4, and 5 each have both NULL children, they are
represented using -1.

Explanation 2:
Each element of the array represents the value of a node. If the value
is -1, it denotes a NULL/None child.
Since node 3 has a NULL left child, and nodes 4 and 5 have both NULL
children, they are represented using -1.
*/
