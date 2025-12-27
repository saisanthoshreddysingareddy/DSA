/*
Problem Description

Given a binary tree, return the inorder traversal of its nodes' values.


Problem Constraints

1 <= number of nodes <= 10^5


Input Format

The first and only argument is the root node of the binary tree A.


Output Format

Return an integer array denoting the inorder traversal of the given
binary tree.


Example Input

Input 1:
        1
         \
          2
         /
        3

Input 2:
        1
       / \
      6   2
         /
        3


Example Output

Output 1:
[1, 3, 2]

Output 2:
[6, 1, 3, 2]


Example Explanation

Explanation 1:
The inorder traversal of the given tree is [1, 3, 2].

Explanation 2:
The inorder traversal of the given tree is [6, 1, 3, 2].
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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> arr = new ArrayList<>();
        helperFunction(A, arr);
        return arr;
    }

    public void helperFunction(TreeNode A, ArrayList<Integer> arr){
        if(A==null){
            return;
        }
        helperFunction(A.left, arr);
        arr.add(A.val);
        helperFunction(A.right, arr);
    }
}
