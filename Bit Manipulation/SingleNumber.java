/*
Problem Description

Given an array of integers, every element appears three times except for one,
which appears exactly once. Find and return that unique element.

NOTE:
  • Your algorithm must run in linear time.
  • Try to implement it without using extra memory.

Problem Constraints
  2 <= |A| <= 5 * 10^6
  0 <= A[i] <= INT_MAX

Input Format
  The first and only argument contains the integer array A.

Output Format
  Return a single integer representing the element that appears once.

Example Input

Input 1:
  A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]

Input 2:
  A = [0, 0, 0, 1]

Example Output

Output 1:
  4

Output 2:
  1

Example Explanation

Explanation 1:
  In Input 1, every element appears three times except 4, which appears once.

Explanation 2:
  In Input 2, every element appears three times except 1, which appears once.
*/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        // [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
        int ans = 0;
        for(int i=0; i<32; i++){
            int count = 0;
            for(int j=0;j<A.size();j++){
                if(checkSetBit(A.get(j), i)){
                    count++;
                }
            }
            if(count%3 != 0){
                ans = ans | (1<<i);
            }
        }
        return ans;
    }
    public boolean checkSetBit(int a, int i){
        if((a & (1<<i)) !=0) {
            return true;
        }
        return false;
    }
}
