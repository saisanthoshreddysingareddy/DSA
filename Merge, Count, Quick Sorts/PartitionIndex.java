/*
Problem Description

Given an integer array A of length N, consider the last element as the pivot p.
Rearrange the elements of the array such that for all i:

  - If A[i] < p, then it should be present on the left side of the partition.
  - If A[i] > p, then it should be present on the right side of the partition.

Rearrange the given array and also return the partition index.

Note:
  - All elements in the array are distinct.

Problem Constraints
  1 <= N <= 10^5
  1 <= A[i] <= 10^9

Input Format
  The only input argument is the integer array A.

Output Format
  Rearrange the array to satisfy the given conditions and
  return the partition index.

Example Input

Input:
  A = [6, 2, 0, 4, 5]

Example Output

Output:
  Valid

  A possible solution can be:
    A = [2, 0, 4, 5, 6]
    partitionIndex = 3

Example Explanation

Explanation:
  The rearrangement is valid because every element in the index range [0, 2]
  is less than the pivot element, and every element in the index range [3, 4]
  is greater than the pivot element.
*/


class Solution {
    public int partition(ArrayList<Integer> arr) {
        int pivot = arr.get(arr.size()-1); //6
        int l = 0;
        int r = arr.size()-2;

        while(l<=r){

            while(l<=r && arr.get(l) <= pivot){
                l++;
            }
            while(l<=r && arr.get(r)>pivot){
                r--;
            }
            if(l<r){
                swap(arr,l,r);
            } 
        }
        swap(arr, arr.size()-1 , l);
        return l;
    }
    public void swap(ArrayList<Integer> A, int start, int end){
        int temp = A.get(end);
        A.set(end, A.get(start));
        A.set(start, temp);
    }
}
