// Problem Description
//
// Given an array arr[] of size N, the task is to find the count of array indices 
// such that removing the element at that index makes the sum of even-indexed 
// and odd-indexed elements of the resulting array equal.
//
// Problem Constraints
// 1 <= N <= 10^5
// -10^5 <= A[i] <= 10^5
// Sum of all elements of A <= 10^9
//
// Input Format
// First argument contains an array A of integers of size N.
//
// Output Format
// Return the count of array indices such that removing an element from these 
// indices makes the sum of even-indexed and odd-indexed array elements equal.
//
// Example Input
// Input 1:
//   A = [2, 1, 6, 4]
//
// Input 2:
//   A = [1, 1, 1]
//
// Example Output
// Output 1:
//   1
//
// Output 2:
//   3
//
// Example Explanation
// Explanation 1:
//   Removing A[1] modifies the array to {2, 6, 4}. 
//   Now, sum of even indices = A[0] + A[2] = 2 + 4 = 6,
//   and sum of odd indices = A[1] = 6.
//   Since both are equal, the answer is 1.
//
// Explanation 2:
//   Removing A[0] → array becomes {1, 1}, even sum = odd sum.
//   Removing A[1] → array becomes {1, 1}, even sum = odd sum.
//   Removing A[2] → array becomes {1, 1}, even sum = odd sum.
//   So, all 3 indices satisfy the condition.



public class Solution {
    public int solve(ArrayList<Integer> A) {
        // A = [2, 4, 4, 10, 2, 3, 3]
        //Build even prefix sum - [2 2 6 6  8 8 11]
        ArrayList<Integer> even_prefix = new ArrayList<>();
        even_prefix.add(A.get(0));
        for(int i=1;i<A.size();i++){
            if(i%2==0){
                even_prefix.add(even_prefix.get(i-1) + A.get(i));
            }else{
                even_prefix.add(even_prefix.get(i-1));
            }
        }

        //Buil dodd prefix sum - [ 0 4 4 14 14 17 17]
        ArrayList<Integer> odd_prefix = new ArrayList<>();
        odd_prefix.add(0);
        for(int i=1; i<A.size(); i++){
            if(i%2==0){
                odd_prefix.add(odd_prefix.get(i-1));
            }else{
                odd_prefix.add(odd_prefix.get(i-1) + A.get(i));
            }
        }

        int count  = 0;
        int sum_e = 0;
        int sum_o = 0;
        for(int i=0; i<A.size();i++){
            if(i==0){
                sum_e = odd_prefix.get(A.size()-1) - odd_prefix.get(i);
                sum_o = even_prefix.get(A.size()-1) - even_prefix.get(i);
            }else{
                sum_e = even_prefix.get(i-1)  + odd_prefix.get(A.size()-1) - odd_prefix.get(i);
                sum_o = odd_prefix.get(i-1)  + even_prefix.get(A.size()-1) - even_prefix.get(i);
            }
            if(sum_e == sum_o){
                count++;
            }
        }
        return count;

    }
}
