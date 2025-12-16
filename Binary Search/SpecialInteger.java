/*
Problem Description

Given an array of integers A and an integer B, find and return the maximum
value K such that there is no subarray of size K in A whose sum of elements
is greater than B.

Problem Constraints
  1 <= |A| <= 100000
  1 <= A[i] <= 10^9
  1 <= B <= 10^9

Input Format
  The first argument is the integer array A.
  The second argument is the integer B.

Output Format
  Return the maximum value of K (subarray length).

Example Input

Input 1:
  A = [1, 2, 3, 4, 5]
  B = 10

Input 2:
  A = [5, 17, 100, 11]
  B = 130

Example Output

Output 1:
  2

Output 2:
  3

Example Explanation

Explanation 1:
  For K = 5, the subarray [1, 2, 3, 4, 5] has a sum greater than B.
  For K = 4, the subarrays [1, 2, 3, 4] and [2, 3, 4, 5] have sums greater than B.
  For K = 3, the subarray [3, 4, 5] has a sum greater than B.
  For K = 2, there is no subarray with sum greater than B.

  Hence, the maximum valid value of K is 2.

Explanation 2:
  For K = 4, the subarray [5, 17, 100, 11] has a sum greater than B.
  For K = 3, there is no subarray with sum greater than B.

  Hence, the maximum valid value of K is 3.
*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        long start = 1;
        long end = A.size();
        long ans = 0;
        while(start<=end){
            long mid = (start+end)/2;
            boolean possible = isPossible(A, mid, B);
            if(possible){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return (int)ans;

    }
    public boolean isPossible(ArrayList<Integer> A, long mid, int B){
            long sum =0;
            //find initial window
            for(int i=0;i<mid;i++){
                sum += A.get(i);
            }
            if(sum>B){
                return false;
            }
            
            //slide the window
            for(int i=(int)mid;i<A.size();i++){
                sum += A.get(i) - A.get(i-(int)mid);
                if(sum>B){
                    return false;
                }
            }
            return true;

        }
}
