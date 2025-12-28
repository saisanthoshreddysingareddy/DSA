/*
Problem Description

Given a Binary Search Tree (BST) A, if there is a node with value B
present in the tree, delete it and return the modified tree.

NOTE:
If there are multiple valid ways to delete the node, always replace
the node with its in-order predecessor.


Problem Constraints

2 <= number of nodes in the BST <= 10^5
1 <= value of nodes <= 10^9
Each node has a unique value


Input Format

The first argument is the root node of the Binary Search Tree A.
The second argument is the integer value B to be deleted.


Output Format

Delete the given node if found and return the root node of the BST.


Example Input

Input 1:
                15
              /    \
            12      20
            / \    /  \
           10  14  16  27
          /
         8

B = 10

Input 2:
                8
               / \
              6   21
             / \
            1   7

B = 6


Example Output

Output 1:
                15
              /    \
            12      20
            / \    /  \
           8   14  16  27

Output 2:
                8
               / \
              1   21
               \
                7


Example Explanation

Explanation 1:
The node with value 10 is deleted from the Binary Search Tree.

Explanation 2:
The node with value 6 is deleted from the Binary Search Tree.
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
    public TreeNode solve(TreeNode A, int B) {
        if(A == null){
            return null;
        }
        if(A.val == B){
            if(A.left == null && A.right == null){
                return null;
            }
            if(A.left == null || A.right == null){
                if(A.left==null){
                    return A.right;
                }else{
                    return A.left;
                }
            }
            
            TreeNode temp = A.left;
            TreeNode maxNode = FindMax(temp);

            A.val = maxNode.val;
            A.left = solve(A.left, maxNode.val);
        }
        else if(A.val < B){
            A.right = solve(A.right, B);
        }else{
            A.left = solve(A.left, B);
        }
        return A;
    }
    TreeNode FindMax(TreeNode node){
        while(node.right != null){
            node = node.right;
        }
        return node;
    }
}
