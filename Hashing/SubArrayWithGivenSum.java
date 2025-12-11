/*
Problem Description

Given an array of positive integers A and an integer B, find and return
the first continuous subarray that adds up to B.

If no such subarray exists, return an array containing a single integer "-1".

"First" subarray refers to the subarray whose starting index is the smallest.

Problem Constraints
  1 <= length of the array <= 100000
  1 <= A[i] <= 10^9
  1 <= B <= 10^9

Input Format
  The first argument is the integer array A.
  The second argument is the integer B.

Output Format
  Return the first continuous subarray whose elements sum to B.
  If no such subarray exists, return an array containing "-1".

Example Input

Input 1:
  A = [1, 2, 3, 4, 5]
  B = 5

Input 2:
  A = [5, 10, 20, 100, 105]
  B = 110

Example Output

Output 1:
  [2, 3]

Output 2:
  [-1]

Example Explanation

Explanation 1:
  The subarray [2, 3] sums to 5.

Explanation 2:
  No subarray in A sums to the required number.
*/


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> arr = new ArrayList<>();
        int left = 0;
        int right = 0;
        long sum = 0;
        while(right<A.size()){
            sum = sum + A.get(right);
            while(sum>B && left<=right){
                sum = sum - A.get(left);
                left++;
            }
            if(sum == B){
                for(int i=left; i<=right; i++){
                    arr.add(A.get(i));
                }
                return arr;
            }
            right++;
        }
        arr.add(-1);
        return arr;
    }
}
