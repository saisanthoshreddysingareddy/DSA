/*
Problem Description

Alex has a cat named Boomer. He decides to test her behavior indefinitely.

He starts on day 1 with a stash of 1 unit of food. Each following day,
the stash doubles in size (i.e., day i produces 2^(i-1) units of food).

Boomer receives the food produced on a day only if she behaves well on that day.

Given that Boomer receives a total of A units of food, determine how many days
she behaved well.

Problem Constraints
  1 <= A <= 2^31 - 1

Input Format
  The first and only argument is an integer A.

Output Format
  Return an integer denoting the number of days Boomer was well behaved.

Example Input

Input 1:
  A = 5

Input 2:
  A = 8

Example Output

Output 1:
  2

Output 2:
  1

Example Explanation

Explanation 1:
  To accumulate 5 units of food, Boomer behaved well on:
    - Day 1 → 1 unit
    - Day 3 → 4 units
  Total = 1 + 4 = 5

Explanation 2:
  To accumulate 8 units of food, Boomer behaved well only on:
    - Day 4 → 8 units
  Total = 8
*/


public class Solution {
    public int solve(int A) {
        int count = 0;
        for(int i=0;i<32; i++){
            if((A & (1<<i)) !=0){
                count++;
            }
        }
        return count;
    }
}
