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
    public ArrayList<Integer> solve(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        q.add(A);
        arr.add(A.val);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr.left != null){
                    q.add(curr.left);
                    arr.add(curr.left.val);
                }else{
                    arr.add(-1);
                }
                if(curr.right != null){
                    q.add(curr.right);
                    arr.add(curr.right.val);
                }else{
                    arr.add(-1);
                }
            }
        }
        return arr;
    }
}
