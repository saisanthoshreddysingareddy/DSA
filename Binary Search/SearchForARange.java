/*
Problem Description

Given a sorted array of integers A (0-indexed) of size N, find the leftmost
and the rightmost index of a given integer B in the array A.

Return an array of size 2 such that:
  - First element  = leftmost index of B in A
  - Second element = rightmost index of B in A

If B is not found in A, return [-1, -1].

Note:
  - The time complexity of your algorithm must be O(log N).

Problem Constraints
  1 <= N <= 10^6
  1 <= A[i], B <= 10^9

Input Format
  The first argument is the integer array A.
  The second argument is the integer B.

Output Format
  Return a 2-element array containing the leftmost and rightmost
  indices (0-based) of B in A.
  If B is not found, return [-1, -1].

Example Input

Input 1:
  A = [5, 7, 7, 8, 8, 10]
  B = 8

Input 2:
  A = [5, 17, 100, 111]
  B = 3

Example Output

Output 1:
  [3, 4]

Output 2:
  [-1, -1]

Example Explanation

Explanation 1:
  The first occurrence of 8 in A is at index 3.
  The last occurrence of 8 in A is at index 4.
  Hence, the answer is [3, 4].

Explanation 2:
  There is no occurrence of 3 in the array.
*/


public class Solution {
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {

        ArrayList<Integer> final_Arr = new ArrayList<>();
        int first = first_index(A,B);
        int second = second_index(A,B);
        final_Arr.add(first);
        final_Arr.add(second);
        return final_Arr;
    }
    public int first_index(List<Integer> arr, int B){
        int s = 0;
        int e = arr.size()-1;
        int ans = -1;
        while(s<=e){
            int midIndex = (s +e)/2;
            int midValue = arr.get(midIndex);
            if(midValue < B){
                s = midIndex+1;
            }else if(midValue>B){
                e = midIndex-1;
            }else{
                 ans = midIndex;
                 e = midIndex-1;
            }
        }
        return ans;
    }
    public int second_index(List<Integer> arr, int B){
        int s = 0;
        int e = arr.size()-1;
        int ans = -1;
        while(s<=e){
            int midIndex = (s + e)/2;
            int midValue = arr.get(midIndex);
            if(midValue<B){
                s = midIndex+1;
            }else if(midValue>B){
                e = midIndex-1;
            }else{
                ans = midIndex;
                s = midIndex+1;
            }
        }
        return ans;
    }
}
