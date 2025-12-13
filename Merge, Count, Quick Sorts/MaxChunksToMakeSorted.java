/*
Problem Description

Given an array of integers A of size N that is a permutation of
[0, 1, 2, ..., (N-1)], we want to split the array into some number of
"chunks" (partitions) such that:

  - If we individually sort each chunk,
  - And then concatenate the sorted chunks in the same order,

The resulting array becomes the fully sorted array [0, 1, 2, ..., N-1].

Your task is to determine the maximum number of chunks that can be formed.

Problem Constraints
  1 <= N <= 100000
  0 <= A[i] < N

Input Format
  The only argument given is the integer array A.

Output Format
  Return the maximum number of chunks that can be formed.

Example Input

Input 1:
  A = [1, 2, 3, 4, 0]

Input 2:
  A = [2, 0, 1, 3]

Example Output

Output 1:
  1

Output 2:
  2

Example Explanation

Explanation 1:
  A = [1, 2, 3, 4, 0]
  To place 0 at the first index in the final sorted array,
  we must include all elements in one chunk.

Explanation 2:
  A = [2, 0, 1, 3]
  We can split the array into 2 chunks:
    - First chunk:  [2, 0, 1]
    - Second chunk: [3]
*/


public class Solution {
    public int solve(ArrayList<Integer> A) {

        int maxSoFar= A.get(0);
        int count =0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>maxSoFar){
                maxSoFar = A.get(i);
            }
            if(maxSoFar == i){
                count++;
            }
        }
        return count;
    }
}
