/*
Problem Description

Farmer John has built a new long barn with N stalls.
You are given an array of integers A of size N, where each element represents
the location of a stall, and an integer B representing the number of cows.

The cows become aggressive if they are placed too close to each other.
To prevent this, John wants to assign the cows to stalls such that the
minimum distance between any two cows is as large as possible.

Your task is to find and return this largest minimum distance.

Problem Constraints
  2 <= N <= 100000
  0 <= A[i] <= 10^9
  2 <= B <= N

Input Format
  The first argument is the integer array A.
  The second argument is the integer B.

Output Format
  Return the largest minimum distance possible among the cows.

Example Input

Input 1:
  A = [1, 2, 3, 4, 5]
  B = 3

Input 2:
  A = [1, 2]
  B = 2

Example Output

Output 1:
  2

Output 2:
  1

Example Explanation

Explanation 1:
  John can assign cows to stalls at locations 1, 3, and 5.
  The minimum distance between any two cows is 2.

Explanation 2:
  With two stalls at locations 1 and 2, the minimum distance is 1.
*/


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        // 2 6 11 14 19 25 30 39 43
        // K=4
        Collections.sort(A);
        int start = getMinDiff(A);
        int end = A.get(A.size()-1) - A.get(0);
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(possible(A, mid, B)){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public boolean possible(ArrayList<Integer> A, int mid, int B){
        int cows = 1;
        int current_sum = 0;
        int current_cow = A.get(0);
        for(int i=0; i<A.size(); i++){
            if(A.get(i)- current_cow >= mid){
                cows++;
                current_cow = A.get(i);
            }
        }
        if(cows<B){
            return false;
        }
        return true;
    }

    public int getMinDiff(ArrayList<Integer> A){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.size()-1; i++){
            int diff = A.get(i+1) - A.get(i);
            if(diff<min){
                min = diff;
            }
        }
        return min;
    }
}
