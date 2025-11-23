// Problem Description
//
// Given a binary string A. You are allowed to perform **at most one swap**
// between any '0' and '1' in the string.
//
// Your task is to return the **maximum possible length of consecutive 1s**
// that can be obtained after performing at most one such swap.
//
// Problem Constraints
//   1 <= length(A) <= 1,000,000
//   A contains only characters '0' and '1'
//
// Input Format
//   The only argument given is a binary string A.
//
// Output Format
//   Return the maximum length of consecutive 1s that can be achieved.
//
// Example Input
// Input 1:
//   A = "111000"
//
// Input 2:
//   A = "111011101"
//
// Example Output
// Output 1:
//   3
//
// Output 2:
//   7
//
// Example Explanation
//   Explanation 1:
//     No swap helps extend the sequence; maximum consecutive 1s = 3.
//
//   Explanation 2:
//     By swapping one '0' with a '1' somewhere else,
//     the longest consecutive 1s that can be formed is 7.


public class Solution {
    public int solve(String A) {
        // Find total ones
        int totalOnes=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == '1'){
                totalOnes++;
            }
        }

        if(totalOnes==A.length()){
            return totalOnes;
        }

        int ans = 0;
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            int left_count=0;
            int right_count=0;
            if(ch=='0'){
                //Find left count 
                int j=i-1;
                while(j>=0 && A.charAt(j)=='1'){
                    left_count++;
                    j--;
                }

                //Find right count 
                int k=i+1;
                while(k<A.length() && A.charAt(k)=='1'){
                    right_count++;
                    k++;
                }
            }
            int current_count = right_count + left_count;
            if(current_count<totalOnes){
                current_count+=1;
            }
            ans = Math.max(ans, current_count);

        }
    return ans;
    }
}
