/*
Problem Description

You are given a sorted array A of size N and a target value B.
Your task is to find the index (0-based indexing) of the target value in the array.

Rules:
  - If the target value is present, return its index.
  - If the target value is not found, return the index of the least element
    that is greater than or equal to B.
  - If the target value is not found and no element greater than or equal to B
    exists, return the length of the array (i.e., the position where the target
    can be inserted).

Your solution should have a time complexity of O(log N).

Problem Constraints
  1 <= N <= 10^5
  1 <= A[i] <= 10^5
  1 <= B <= 10^5

Input Format
  The first argument is the integer array A of size N.
  The second argument is the integer B.

Output Format
  Return an integer denoting the index of the target value.

Example Input

Input 1:
  A = [1, 3, 5, 6]
  B = 5

Input 2:
  A = [1, 4, 9]
  B = 3

Example Output

Output 1:
  2

Output 2:
  1

Example Explanation

Explanation 1:
  The target value is present at index 2.

Explanation 2:
  The target value is not present in the array.
  It should be inserted at index 1.
*/


public class Solution {
    public int searchInsert(ArrayList<Integer> A, int B) {
        //    [0  1  2  3  4   5   6]
        //A = [2, 4, 6, 8, 10, 12, 14],   B = 9
        int start = 0;
        int end = A.size()-1;
        int ans = -1;
        int found_index = -1;
        while(start <= end){
            int mid = start + (end- start)/2;
            if(A.get(mid) > B){
                found_index = mid;
                end = mid-1;
            }else if(A.get(mid) < B){
                start = mid+1;
            }else{
                ans = mid;
                return ans;
            }
        }
        if(found_index != -1){
            return found_index;
        }
        return A.size();
    }
}
