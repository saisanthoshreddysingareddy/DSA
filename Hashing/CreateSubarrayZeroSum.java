/*
Problem Description

Given an array A of N integers, find the count of subarrays that sum to zero.
Since the answer can be very large, return the result modulo (10^9 + 7).

Problem Constraints
  1 <= N <= 10^5
  -10^9 <= A[i] <= 10^9

Input Format
  The only argument is the integer array A.

Output Format
  Return an integer representing the number of subarrays whose sum is zero.

Example Input

Input 1:
  A = [1, -1, -2, 2]

Input 2:
  A = [-1, 2, -1]

Example Output

Output 1:
  3

Output 2:
  1

Example Explanation

Explanation 1:
  The subarrays with zero sum are:
    [1, -1],
    [-2, 2],
    [1, -1, -2, 2]

Explanation 2:
  The subarray with zero sum is:
    [-1, 2, -1]
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //[1, -1, -2, 2]
        int prefix_Sum =0;
        map.put(0, 1);
        int mod = 1000000007;
        int count = 0;
        for(int i=0;i<A.size();i++){
            prefix_Sum += A.get(i);
            if(map.containsKey(prefix_Sum)){
                count =(count + map.get(prefix_Sum))%mod;
            }
            if(map.containsKey(prefix_Sum)){
                int value = (map.get(prefix_Sum)+1)%mod;
                map.put(prefix_Sum, value);
            }else{
                map.put(prefix_Sum, 1);
            }

        }
        return count;
    }
}
