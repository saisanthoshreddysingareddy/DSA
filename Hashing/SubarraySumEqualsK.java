/*
Problem Description

Given an array of integers A and an integer B,
your task is to find the total number of subarrays whose sum is equal to B.

Problem Constraints
  1 <= length of the array <= 50000
  -1000 <= A[i] <= 1000

Input Format
  The first argument is the integer array A.
  The second argument is the integer B.

Output Format
  Return an integer representing the total number of subarrays
  whose sum equals B.

Example Input

Input 1:
  A = [1, 0, 1]
  B = 1

Input 2:
  A = [0, 0, 0]
  B = 0

Example Output

Output 1:
  4

Output 2:
  6

Example Explanation

Explanation 1:
  The subarrays that sum to 1 are:
    [1], [1, 0], [0, 1], and [1]
  Hence, the total count is 4.

Explanation 2:
  All possible subarrays of A sum to 0.
  Therefore, the total count is 6.
*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        //A =  [ 1 0 1 ]
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int count =0; //1 
        for(int i=0;i<A.size();i++){
            prefix_sum += A.get(i); // [ 1  ]
            if(prefix_sum == B){
                count++;
            }
            int target = prefix_sum - B; 
            if(map.containsKey(target)){
                count+=map.get(target);
            }

            if(map.containsKey(prefix_sum)){
                int curr = map.get(prefix_sum);
                map.put(prefix_sum, curr+1);
            }else{
                map.put(prefix_sum,1);
            }
        }
        return count;

    }
}
