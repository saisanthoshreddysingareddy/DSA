/*
Problem Description

There is a football event going on in your city.
In this event, you are given A passes and players having IDs between 1 and 10^6.

Initially, a player with a given ID has the ball in his possession.
You need to determine the ID of the player who possesses the ball
after exactly A passes.

There are two kinds of passes:

1) ID
2) 0

For the first kind of pass:
  The player in possession of the ball passes the ball forward
  to the player with ID = ID.

For the second kind of pass:
  The player in possession of the ball passes the ball back
  to the player who had previously forwarded the ball to him.

In the second kind of pass, "0" represents a back pass.

Return the ID of the player who currently possesses the ball
after A passes.

Problem Constraints
  1 <= A <= 100000
  1 <= B <= 100000
  |C| = A

Input Format
  The first argument contains the integer A (number of passes).
  The second argument contains the integer B (ID of the player
  who initially possesses the ball).
  The third argument is an integer array C of size A containing
  values (ID or 0).

Output Format
  Return the ID of the player who possesses the ball after A passes.

Example Input

Input 1:
  A = 10
  B = 23
  C = [86, 63, 60, 0, 47, 0, 99, 9, 0, 0]

Input 2:
  A = 1
  B = 1
  C = [2]

Example Output

Output 1:
  63

Output 2:
  2

Example Explanation

Explanation 1:
  Initially, player with ID = 23 possesses the ball.
  After pass 1,  player with ID = 86 possesses the ball.
  After pass 2,  player with ID = 63 possesses the ball.
  After pass 3,  player with ID = 60 possesses the ball.
  After pass 4,  player with ID = 63 possesses the ball.
  After pass 5,  player with ID = 47 possesses the ball.
  After pass 6,  player with ID = 63 possesses the ball.
  After pass 7,  player with ID = 99 possesses the ball.
  After pass 8,  player with ID = 9  possesses the ball.
  After pass 9,  player with ID = 99 possesses the ball.
  After pass 10, player with ID = 63 possesses the ball.

Explanation 2:
  The ball is passed to player with ID = 2.
*/

public class Solution {
    public int solve(int A, int B, ArrayList<Integer> C) {
        Stack<Integer> st = new Stack<>();
        if(st.isEmpty()){
            st.push(B);
        }
        for(int i=0; i<C.size(); i++){
            int val = C.get(i);
            if(val != 0){
                st.push(val);
            }else{
                st.pop();
            }
        }
        return st.peek();
    }
}
