/*
Problem Description

Given an array A of N integers,
find the length of the longest subarray whose sum is equal to zero.

If no such subarray exists, return 0.

Problem Constraints
  1 <= N <= 10^5
  -10^9 <= A[i] <= 10^9

Input Format
  The only argument is the integer array A.

Output Format
  Return an integer representing the length of the longest subarray
  that sums to zero.

Example Input

Input 1:
  A = [1, -2, 1, 2]

Input 2:
  A = [3, 2, -1]

Example Output

Output 1:
  3

Output 2:
  0

Example Explanation

Explanation 1:
  The subarray [1, -2, 1] has a sum of 0 and its length is 3,
  which is the longest possible.

Explanation 2:
  No subarray in A sums to 0, so the answer is 0.
*/


public class Solution {
    public int solve(ArrayList<Integer> A) {
        long sum =0;
        long maxLen = 0;
        HashMap<Long, Long> map = new HashMap<>();
        // A = [1, 2, -2, 4, -4]
        for(int i=0;i<A.size();i++){
            sum += A.get(i);
            if(sum == 0){
                return (int)i+1;
            }
            else if(map.containsKey(sum)){
                long value = i - map.get(sum);
                maxLen = Math.max(maxLen, value);
            }else{
                map.put(sum,(long)i);
            }
        }
        return (int)maxLen;

    }
}
