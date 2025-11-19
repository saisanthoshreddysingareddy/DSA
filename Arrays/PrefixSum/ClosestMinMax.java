// Problem Description
//
// Given an array A, find the size of the smallest subarray such that it contains 
// at least one occurrence of the maximum value of the array and at least one occurrence 
// of the minimum value of the array.
//
// Problem Constraints
// 1 <= |A| <= 2000
//
// Input Format
// First and only argument is vector A.
//
// Output Format
// Return the length of the smallest subarray which has at least one occurrence 
// of minimum and maximum element of the array.
//
// Example Input
// Input 1:
//   A = [1, 3, 2]
// Input 2:
//   A = [2, 6, 1, 6, 9]
//
// Example Output
// Output 1:
//   2
// Output 2:
//   3
//
// Example Explanation
// Explanation 1:
//   Take the 1st and 2nd elements as they are the minimum and maximum elements respectively.
// Explanation 2:
//   Take the last 3 elements of the array.



public class Solution {
    public int solve(ArrayList<Integer> A) {
        //Find min
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<min){
                min = A.get(i);
            }
        }

        //Find max
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>max){
                max = A.get(i);
            }
        }

       if(max == min){
           return 1;
       }
        int lastMaxIndex = -1;
        int lastMinIndex = -1;
        int ans = Integer.MAX_VALUE;
        for(int i=A.size()-1;i>=0;i--){
            if(A.get(i) == max){
                if(lastMinIndex != -1){
                    int len1 = lastMinIndex - i +1;
                    ans = Math.min(ans,len1); 
                }
                lastMaxIndex = i;
            }else if(A.get(i) == min){
                if(lastMaxIndex != -1){
                    int len = lastMaxIndex - i + 1;
                    ans = Math.min(ans,len);
                }
                lastMinIndex = i;
            }
        }
        return ans;
    }
}
