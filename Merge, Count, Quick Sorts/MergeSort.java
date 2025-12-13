/*
Problem Description

Given an array A, sort this array using the Count Sort algorithm
and return the sorted array.

Problem Constraints
  1 <= |A| <= 10^5
  1 <= A[i] <= 10^5

Input Format
  The first argument is an integer array A.

Output Format
  Return an integer array that represents the sorted version of A.

Example Input

Input 1:
  A = [1, 3, 1]

Input 2:
  A = [4, 2, 1, 3]

Example Output

Output 1:
  [1, 1, 3]

Output 2:
  [1, 2, 3, 4]

Example Explanation

For Input 1:
  The array in sorted order is [1, 1, 3].

For Input 2:
  The array in sorted order is [1, 2, 3, 4].
*/


public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        mergeSort(A, 0, A.size()-1);
        return A;
    }
    public void mergeSort(ArrayList<Integer> A, int l, int r){
        if(l==r){
            return;
        }
        int mid = (l+r)/2;
        mergeSort(A, l, mid);
        mergeSort(A, mid+1, r);
        merge(A, l, mid, r);
    }
    public ArrayList<Integer> merge(ArrayList<Integer> A, int l, int mid, int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = mid+1;
        while(i<=mid && j<=r){
            if(A.get(i)<=A.get(j)){
                temp.add(A.get(i));
                i++;
            }else{
                temp.add(A.get(j));
                j++;
            }
        }
        while(i<=mid){
            temp.add(A.get(i));
            i++;
        }
        while(j<=r){
            temp.add(A.get(j));
            j++;
        }

        for(int m=l;m<=r;m++){
            A.set(m, temp.get(m-l));
        }

        return temp;
    }
}
