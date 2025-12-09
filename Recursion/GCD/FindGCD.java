public class Solution {
    public int gcd(int A, int B) {
        // Extended Euclids Algorithm
        if(A==0){
            return B;
        }
        if(B==0){
            return A;
        }
        if(A>B){
            return gcd(A%B,B);
        }else{
            return gcd(B%A,A);
        }
    }
}
