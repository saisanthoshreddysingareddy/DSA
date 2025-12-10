/*
Problem Description

You are given:
  - An array A of N integers
  - An integer B

Your task is to count the number of pairs (i, j) such that:

      A[i] + A[j] = B
      i ≠ j

Since the value can be large, return the count modulo (10^9 + 7).

Important Notes:
  - The pair (i, j) is considered the same as (j, i).
    Hence, each valid pair should be counted only once.
  - You do NOT need to return the actual pairs.

Problem Constraints
  1 <= N <= 100000
  1 <= A[i] <= 10^9
  1 <= B <= 10^9

Input Format
  The first argument is the integer array A.
  The second argument is the integer B.

Output Format
  Return the number of valid pairs whose sum equals B,
  modulo (10^9 + 7).

Example Input

Input 1:
  A = [3, 5, 1, 2]
  B = 8

Input 2:
  A = [1, 2, 1, 2]
  B = 3

Example Output

Output 1:
  1

Output 2:
  4

Example Explanation

Explanation 1:
  Only one pair (i, j) satisfies A[i] + A[j] = 8 → the pair using elements (3, 5).

Explanation 2:
  The pairs that sum to 3 are:
    (1, 2), (1, 4), (2, 3), (3, 4)
  Hence, total pairs = 4.
*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        long ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            int target = B - A.get(i);
            if(map.containsKey(target)){
                ans += map.get(target);
            }
            if(map.containsKey(A.get(i))){
                int freq = map.get(A.get(i));
                map.put(A.get(i), freq+1);
            }else{
                map.put(A.get(i),1);
            }
        }
        long result = ans %1000000007;
        return (int)result;
    }
}
