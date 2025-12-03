// Problem Description
//
// You are given a binary string A consisting of characters A1, A2, ..., AN,
// where each character is either '0' or '1'.
//
// In a single operation, you may choose two indices L and R 
// such that 1 ≤ L ≤ R ≤ N, and flip all characters AL, AL+1, ..., AR.
// Flipping means converting '0' → '1' and '1' → '0'.
//
// Your task is to perform AT MOST one such operation so that 
// the final string contains the maximum possible number of '1's.
//
// If performing no operation yields the best result,
// return an empty array.
// Otherwise, return an array containing two integers [L, R].
//
// If multiple pairs [L, R] yield the same number of '1's,
// return the lexicographically smallest pair.
//
// NOTE:
// Pair (a, b) is lexicographically smaller than pair (c, d) if:
//      a < c, OR
//      a == c AND b < d.
//
//
// Problem Constraints
//    1 <= size of string A <= 100000
//
//
// Input Format
//    The first and only argument is the string A.
//
//
// Output Format
//    Return an array of integers denoting the indices [L, R].
//    Return an empty array if no operation increases the number of '1's.
//
//
// Example Input
// Input 1:
//    A = "010"
//
// Input 2:
//    A = "111"
//
//
// Example Output
// Output 1:
//    [1, 1]
//
// Output 2:
//    []
//
//
// Example Explanation
// Explanation 1:
//    A = "010"
//
//    Pair of [L, R]  |  Final String
//    ----------------|----------------
//    [1, 1]          |  "110"
//    [1, 2]          |  "100"
//    [1, 3]          |  "101"
//    [2, 2]          |  "000"
//    [2, 3]          |  "001"
//
//    The pairs [1,1] and [1,3] both give the maximum number of '1's,
//    but [1,1] is lexicographically smaller.
//    Therefore, the answer is [1,1].
//
// Explanation 2:
//    For A = "111", flipping any segment will reduce the number of '1's.
//    So, the correct answer is an empty array [].


public class Solution {
    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> arr = new ArrayList<>(); // [1 -1 1]
        for(int i=0;i<A.length();i++){
            int val = A.charAt(i);
            if(val == '0'){
                arr.add(1);
            }else{
                arr.add(-1);
            }
        }

        int start = 0;
        int end =0;
        int tempStart = 0;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        // [1 -1 1]
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(sum>maxSum){
                maxSum = Math.max(maxSum, sum);
                start = tempStart;
                end = i;
            }
            if(sum<0){
                sum = 0;
                tempStart = i+1;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(start+1);
        result.add(end+1);
        if(maxSum<=0){
            return new ArrayList<>();
        }
        return result;


    }
}
