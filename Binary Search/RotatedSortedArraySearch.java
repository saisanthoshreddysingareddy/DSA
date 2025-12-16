/*
Problem Description

Given a sorted array of integers A of size N and an integer B,
where array A is rotated at some pivot unknown beforehand.

For example, the array:
  [0, 1, 2, 4, 5, 6, 7]
might become:
  [4, 5, 6, 7, 0, 1, 2]

Your task is to search for the target value B in the array.
If found, return its index; otherwise, return -1.

You can assume that no duplicates exist in the array.

NOTE:
  - The expected time complexity is O(log N).

Problem Constraints
  1 <= N <= 1_000_000
  1 <= A[i] <= 10^9
  All elements in A are distinct.

Input Format
  The first argument is the integer array A.
  The second argument is the integer B.

Output Format
  Return the index of B in array A.
  If B is not present, return -1.

Example Input

Input 1:
  A = [4, 5, 6, 7, 0, 1, 2, 3]
  B = 4

Input 2:
  A = [9, 10, 3, 5, 6, 8]
  B = 5

Example Output

Output 1:
  0

Output 2:
  3

Example Explanation

Explanation 1:
  Target value 4 is found at index 0 in array A.

Explanation 2:
  Target value 5 is found at index 3 in array A.
*/


public class Solution {
    public int search(final List<Integer> A, int B) {
        //      0  1  2  3  4  5  6  7
        // A = [4, 5, 6, 7, 0, 1, 2, 3]

        //Find pivot index 
        int start = 0;
        int end = A.size()-1;
        int pivotIndex = findPivot(A, start, end);
        if(A.get(pivotIndex) == B){
            return pivotIndex;
        }
        if(pivotIndex == 0){
            return binarySearch(A, 0, A.size()-1, B);
        }
        if(A.get(0) <= B){
            return binarySearch(A, 0, pivotIndex-1, B);
        }else{
            return binarySearch(A, pivotIndex, A.size()-1, B);
        }
    }
    // 0 1 2 3 4 5 6 7
    // 1 2 3 4 5 6 7 8
    public int binarySearch(List<Integer> A, int start, int end, int target){
        while(start<=end){
            int mid = (start+end)/2;
            if(A.get(mid) == target){
                return mid;
            }
            else if(A.get(mid)<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }


    public int findPivot(List<Integer> A, int s, int e){
        while(s<=e){
            if(A.get(s)<=A.get(e)){
                return s;
            }
            int mid = (s+e)/2;
            if(A.get(mid)>A.get(e)){
                s=mid+1;
            }else{
                e = mid;
            }
        }
        return s;
    }
}
