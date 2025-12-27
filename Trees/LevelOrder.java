/*
Problem Description

Given a binary tree, return the level order traversal of its nodes' values
(i.e., from left to right, level by level).


Problem Constraints

1 <= number of nodes <= 10^5


Input Format

The first and only argument is the root node of the binary tree A.


Output Format

Return a 2D integer array denoting the level order traversal of the given
binary tree.


Example Input

Input 1:
        3
       / \
      9  20
        /  \
       15   7

Input 2:
        1
       / \
      6   2
         /
        3


Example Output

Output 1:
[
  [3],
  [9, 20],
  [15, 7]
]

Output 2:
[
  [1],
  [6, 2],
  [3]
]


Example Explanation

Explanation 1:
Return the 2D array where each row represents the nodes present at
that level of the binary tree, traversed from left to right.
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
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        ArrayList<ArrayList<Integer>> final_array = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll(); // 3
                arr.add(curr.val); 
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            final_array.add(arr);
        }
        return final_array;
    }
}
