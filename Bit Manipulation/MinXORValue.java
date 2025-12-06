/*
Problem Description

Given an integer array A of size N, find the pair of integers in the array
that gives the minimum XOR value. Return this minimum XOR value.

Problem Constraints
  2 <= N <= 100000
  0 <= A[i] <= 10^9

Input Format
  The first and only argument given is an integer array A.

Output Format
  Return a single integer denoting the minimum XOR value obtainable
  by XOR-ing any pair of elements in the array.

Example Input

Input 1:
  A = [0, 2, 5, 7]

Input 2:
  A = [0, 4, 7, 9]

Example Output

Output 1:
  2

Output 2:
  3

Example Explanation

Explanation 1:
  The minimum XOR pair is (0, 2):
    0 xor 2 = 2
*/


public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int min_value = Integer.MAX_VALUE;
        for(int i=1;i<A.size();i++){
            int pair = (A.get(i-1)^A.get(i));
            min_value = Math.min(min_value, pair);
        }
        return min_value;
    }
}
