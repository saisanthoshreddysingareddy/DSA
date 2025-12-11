/*
Problem Description

Given an array of integers A, determine whether it contains a non-empty
subarray whose sum is equal to 0.

Your task is to return:
  - 1, if there exists at least one subarray with sum equal to 0
  - 0, otherwise

Problem Constraints
  1 <= |A| <= 100000
  -10^9 <= A[i] <= 10^9

Input Format
  The only argument given is the integer array A.

Output Format
  Return 1 if there exists a subarray with sum 0,
  otherwise return 0.

Example Input

Input 1:
  A = [1, 2, 3, 4, 5]

Input 2:
  A = [4, -1, 1]

Example Output

Output 1:
  0

Output 2:
  1

Example Explanation

Explanation 1:
  No subarray in A has a sum equal to 0.

Explanation 2:
  The subarray [-1, 1] has a sum of 0. Therefore, the answer is 1.
*/


public class Solution {
  public int solve(ArrayList<Integer> A) {
        ArrayList<Long> pf_arr = new ArrayList<>();
        pf_arr.add((long)A.get(0));
        for(int i=1; i<A.size(); i++){
            pf_arr.add(pf_arr.get(i-1)+A.get(i));
        }
        HashSet<Long> set = new HashSet<>();
        for(int i=0; i<pf_arr.size(); i++){
            if(pf_arr.get(i) == 0L){
                return 1;
            }
            if(set.contains(pf_arr.get(i))){
                return 1;
            }
            set.add(pf_arr.get(i));
        }
        return 0;
        
  }
}
