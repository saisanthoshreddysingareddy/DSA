/*
Problem Description

Given two sorted arrays A and B of sizes M and N respectively,
return the median of the two sorted arrays.

Round off the value to the floor integer.
For example:
  2.6 → 2
  2.2 → 2

Problem Constraints
  0 <= M <= 10^5
  0 <= N <= 10^5
  -10^9 <= A[i], B[i] <= 10^9

Input Format
  The first argument is the integer array A.
  The second argument is the integer array B.

Output Format
  Return an integer representing the median.

Example Input

Input 1:
  A = [5, 7]
  B = [6]

Input 2:
  A = [1, 2]
  B = [3, 4]

Example Output

Output 1:
  6

Output 2:
  2

Example Explanation

Explanation 1:
  The merged array is [5, 6, 7].
  The median is 6.

Explanation 2:
  The merged array is [1, 2, 3, 4].
  The median is (2 + 3) / 2 = 2.5.
  Taking the floor value gives 2.
*/


public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> merge_arr = new ArrayList<>();
        int A_size = A.size();
        int B_size = B.size();
        int i=0;
        int j=0;
        while(i<A_size && j<B_size){
            if(A.get(i) <= B.get(j)){
                merge_arr.add(A.get(i));
                i++;
            }else{
                merge_arr.add(B.get(j));
                j++;
            }
        }

        while(i<A_size){
            merge_arr.add(A.get(i));
            i++;
        }
        while(j<B_size){
            merge_arr.add(B.get(j));
            j++;
        }
        // 1 2 3 4
        int merge_arr_Size = merge_arr.size();
        int val = 0;
        if(merge_arr_Size%2==1){
            int half = merge_arr_Size/2;
            return merge_arr.get(half);
        }else{
            int first_value = merge_arr_Size/2 -1; 
            int second_Value = merge_arr_Size/2;
            // val = (A.get(first_value) +A.get(second_Value))/2;
            return (merge_arr.get(first_value) +merge_arr.get(second_Value))/2;
        }
    }
}
