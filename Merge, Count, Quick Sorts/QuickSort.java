/*
Problem Description

Given an integer array A, sort the array using Quick Sort.

Problem Constraints
  1 <= |A| <= 10^5
  1 <= A[i] <= 10^9

Input Format
  The first argument is an integer array A.

Output Format
  Return the sorted array.

Example Input

Input 1:
  A = [1, 4, 10, 2, 1, 5]

Input 2:
  A = [3, 7, 1]

Example Output

Output 1:
  [1, 1, 2, 4, 5, 10]

Output 2:
  [1, 3, 7]

Example Explanation

Explanation 1 and 2:
  Return the sorted array.
*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        quickSort(A, 0, A.size()-1);
        return A;
    }
    public void quickSort(ArrayList<Integer> A, int s, int e){
        if(s>=e){
            return;
        }
        int pivotIndex = partition(A, s, e);
        quickSort(A, s, pivotIndex-1);
        quickSort(A, pivotIndex+1, e);
    }
    public int partition(ArrayList<Integer> A, int s, int e){
        int pivot_element = A.get(s);
        int l = s+1;
        int r = e;
        while(l<=r){
            if(A.get(l)<=pivot_element){
                l++;  
            }else if(A.get(r)>pivot_element){
                r--;
            }else{
                int temp = A.get(r);
                A.set(r, A.get(l));
                A.set(l, temp);
                l++;
                r--;
            }
        }
        int temp = A.get(s);
        A.set(s, A.get(r));
        A.set(r, temp);
        return r;
    }
}
