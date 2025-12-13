/*
Problem Description

You are given an array A of integers of length N and two indices B and C.

Your task is to sort the subarray A[B..C] within the given array.
The rest of the array should remain unchanged.

Problem Constraints
  1 <= N <= 10^5
  0 <= A[i] <= 10^9
  0 <= B <= C <= N - 1

Input Format
  The first argument is the array A of length N.
  The next two arguments are the integers B and C.

Output Format
  Return the array after sorting the subarray [B, C].

Example Input

Input 1:
  A = [59, 11, 8, 91, 49, 44, 8]
  B = 4
  C = 6

Input 2:
  A = [50, 40, 30, 20, 10]
  B = 0
  C = 3

Example Output

Output 1:
  [59, 11, 8, 91, 8, 44, 49]

Output 2:
  [20, 30, 40, 50, 10]

Example Explanation

Explanation 1:
  The subarray A[4..6] = [49, 44, 8].
  After sorting, it becomes [8, 44, 49].
  The rest of the array remains unchanged.

Explanation 2:
  The subarray A[0..3] = [50, 40, 30, 20].
  After sorting, it becomes [20, 30, 40, 50].
  The rest of the array remains unchanged.
*/

public class Solution {
    public ArrayList<Integer> sortSubarray(ArrayList<Integer> A, int B, int C) {
        
        ArrayList<Integer> range_arr = new ArrayList<>();
        for(int i=B; i<=C; i++){
            range_arr.add(A.get(i));
        }
        // [49, 44, 8]

        mergeSort(range_arr, 0, range_arr.size()-1);
        
        for(int i=B;i<=C;i++){
            A.set(i, range_arr.get(i-B));
        }
        return A;
    }
    public void mergeSort(ArrayList<Integer> arr, int start, int end){
        int mid = (start+end)/2;
        if(start==end){
            return;
        }
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    // [49, 44, 8]
    public ArrayList<Integer> merge(ArrayList<Integer> arr, int low, int mid_value, int high){
        int left = low; 
        int right = mid_value+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left <= mid_value && right <= high){
            if(arr.get(left) < arr.get(right)){
                temp.add(arr.get(left));
                left++;
            }else{
                temp.add(arr.get(right));
                right++;
            }
        }

        while(left <= mid_value){
            temp.add(arr.get(left));
            left++;
        }

        while(right <= high){
            temp.add(arr.get(right));
            right++;
        }

        for(int i=low;i<=high;i++){
            arr.set(i, temp.get(i-low));
        }
        return arr;
    }
}
