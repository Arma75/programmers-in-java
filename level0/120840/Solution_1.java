// https://school.programmers.co.kr/learn/courses/30/lessons/120840?language=java
import java.math.BigInteger;

class Solution {
    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for( int i = 2; i <= n; i++ ) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        return result;
    }
    
    public int solution(int balls, int share) {
        BigInteger numner = factorial(balls);
        BigInteger denom = factorial(balls - share).multiply(factorial(share));
        
        return numner.divide(denom).intValue();
    }
}