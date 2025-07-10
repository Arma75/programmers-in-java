// https://school.programmers.co.kr/learn/courses/30/lessons/120840?language=java
import java.math.BigInteger;

class Solution {
    public BigInteger factorial(BigInteger n) {
        if( n.compareTo(BigInteger.ONE) < 1 ) {
            return BigInteger.ONE;
        }
        
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
    
    public int solution(int balls, int share) {
        return factorial(BigInteger.valueOf(balls)).divide((factorial(BigInteger.valueOf(balls - share)).multiply(factorial(BigInteger.valueOf(share))))).intValue();
    }
}