/*
Problem Description

Given two sorted integer arrays A and B, merge them into one sorted array
and return the result.

Note:
  - A linear time complexity is expected.
  - You should avoid using any library sorting functions.

Problem Constraints
  -2 × 10^9 <= A[i], B[i] <= 2 × 10^9
  1 <= |A|, |B| <= 5 × 10^4

Input Format
  The first argument is a 1-D integer array A.
  The second argument is a 1-D integer array B.

Output Format
  Return a 1-D array representing the merged sorted result of A and B.

Example Input

Input 1:
  A = [4, 7, 9]
  B = [2, 11, 19]

Input 2:
  A = [1]
  B = [2]

Example Output

Output 1:
  [2, 4, 7, 9, 11, 19]

Output 2:
  [1, 2]

Example Explanation

Explanation 1:
  Merging A and B produces the sorted array [2, 4, 7, 9, 11, 19].

Explanation 2:
  Merging A and B produces the sorted array [1, 2].
*/


public class Solution {
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<A.size() && j<B.size()){
            if(A.get(i)<=B.get(j)){
                arr.add(A.get(i));
                i++;
            }else{
                arr.add(B.get(j));
                j++;
            }
        }
        while(i<A.size()){
            arr.add(A.get(i));
            i++;
        }
        while(j<B.size()){
            arr.add(B.get(j));
            j++;
        }
        return arr;
    }
}
