/*
Problem Description

Given the root node of a binary tree denoted by A, serialize the given
binary tree in the described format.

Serialize means encoding the binary tree into an integer array denoting
the level order traversal of the given binary tree.

NOTE:
In the array, a NULL/None child is denoted by -1.
For more clarification, refer to the example inputs.


Problem Constraints

1 <= number of nodes <= 10^5


Input Format

The first and only argument is the root node of the binary tree A.


Output Format

Return an integer array denoting the level order traversal of the given
binary tree.


Example Input

Input 1:
                1
              /   \
             2     3
            / \
           4   5

Input 2:
                1
              /   \
             2     3
            / \     \
           4   5     6


Example Output

Output 1:
[1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1]

Output 2:
[1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1]


Example Explanation

Explanation 1:
The level order traversal of the given tree is
[1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1].
Since nodes 3, 4, and 5 have NULL children, they are represented
using -1.

Explanation 2:
The level order traversal of the given tree is
[1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1].
Since node 3 has a NULL left child, and nodes 4 and 5 have both
children as NULL, they are represented using -1.
*/
