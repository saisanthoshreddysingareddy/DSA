/*
Problem Description

Given a binary tree, check whether the given tree is a Sum-binary Tree
or not.

A Sum-binary Tree is a binary tree where the value of every node is equal
to the sum of the values of nodes present in its left subtree and right
subtree.

An empty tree is considered a Sum-binary Tree, and the sum of an empty
tree is considered as 0. A leaf node is also considered a Sum-binary Tree.

Return 1 if the given tree is a Sum-binary Tree, else return 0.


Problem Constraints

1 <= number of nodes <= 100000
0 <= node values <= 50


Input Format

The first and only argument is the root node of the binary tree A.


Output Format

Return 1 if the tree is a Sum-binary Tree, else return 0.


Example Input

Input 1:
            26
          /    \
         10     3
        /  \     \
       4    6     3

Input 2:
            26
          /    \
         10     3
        /  \     \
       4    6     4


Example Output

Output 1:
1

Output 2:
0


Example Explanation

Explanation 1:
All leaf nodes are considered Sum-binary Trees.
Value of node 10 = 4 + 6.
Value of node 3 = 0 + 3.
Value of node 26 = (10 + 4 + 6) + 6.

Explanation 2:
The sum of the left subtree and right subtree is 27, which is not equal
to the value of the root node (26).
*/


/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    boolean isSumTree = true;
    public int solve(TreeNode A) {
        helper(A);
        if(isSumTree){
            return 1;
        }
        return 0;
    }
    
    public int helper(TreeNode A){
        if(A==null){
            return 0;
        }
        if (A.left == null && A.right == null) {
            return A.val;
        }
        int leftSum = helper(A.left);
        int rightSum = helper(A.right);
        if(A.val != leftSum + rightSum){
            isSumTree = false;
        }
        return A.val + leftSum + rightSum;
    }
}
