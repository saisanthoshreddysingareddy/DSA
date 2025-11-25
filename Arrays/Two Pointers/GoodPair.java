// Problem Description
  
// Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
  
// Problem Constraints
//   1 <= A.size() <= 104
//   1 <= A[i] <= 109
//   1 <= B <= 109

// Input Format - First argument is an integer array A. Second argument is an integer B.
// Output Format - Return 1 if good pair exist otherwise return 0.

// Example Input
// Input 1:
//   A = [1,2,3,4]
//   B = 7
// Input 2:
//   A = [1,2,4]
//   B = 4
// Input 3:
//   A = [1,2,2]
//   B = 4

// Example Output
//   Output 1: 1
//   Output 2: 0
//   Output 3: 1

// Example Explanation
//   Explanation 1: (i,j) = (3,4)
//   Explanation 2: No pair has sum equal to 4.
//   Explanation 3: (i,j) = (2,3)

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int sum = 0;
        int  i=0;
        int j =A.size()-1;
        while(i<j){
            int val = (A.get(i) + A.get(j));
            if(val == B){
                return 1;
            }else if(val<B){
                i++;
            }else if(val>B){
                j--;
            }
        }
        return 0;
    }
}


import java.util.*;
public class Solution {
    public int solve(int[] A, int B) {
        HashSet<Integer> hs = new HashSet<>();
        for(int x:A){
            int val = B-x;
            if(hs.contains(val)){
                return 1;
            }
            hs.add(x);
        }
        return 0;
    }
}

//TC - O(N)
//SC - O(N)
