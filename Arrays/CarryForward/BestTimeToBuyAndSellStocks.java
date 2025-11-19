// Problem Description
//
// You are given an array A, where A[i] represents the price of a stock on day i.
// You are permitted to complete at most ONE transaction:
//     → Buy one share on any day
//     → Sell one share on a later day
//
// Your task is to design an algorithm that returns the maximum possible profit
// from this single buy–sell transaction.
//
// -----------------------------------------------------------------------------
// Problem Constraints
// 0 <= A.size() <= 700000
// 1 <= A[i] <= 10^7
//
// -----------------------------------------------------------------------------
// Input Format
// The only argument is an integer array A.
//
// -----------------------------------------------------------------------------
// Output Format
// Return an integer representing the maximum profit possible.
//
// -----------------------------------------------------------------------------
// Example Input
//
// Input 1:
//   A = [1, 2]
//
// Input 2:
//   A = [1, 4, 5, 2, 4]
//
// -----------------------------------------------------------------------------
// Example Output
//
// Output 1:
//   1
//
// Output 2:
//   4
//
// -----------------------------------------------------------------------------
// Example Explanation
//
// Explanation 1:
//   Buy on day 0 (price = 1), sell on day 1 (price = 2).
//   Profit = 2 - 1 = 1.
//
// Explanation 2:
//   Buy on day 0 (price = 1), sell on day 2 (price = 5).
//   Profit = 5 - 1 = 4.


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        if(A.size()==0){
            return 0;
        }
        int min = A.get(0);
        int current_profit = 0;
        int highest_profit = 0;
        for(int i=1;i<A.size();i++){
            if(A.get(i)<min){
                min = A.get(i);
            }
            current_profit = A.get(i) -min;
            if(current_profit>highest_profit){
                highest_profit = current_profit;
            }
        }
        return highest_profit;
    }
}
