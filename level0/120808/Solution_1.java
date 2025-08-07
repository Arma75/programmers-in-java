// https://school.programmers.co.kr/learn/courses/30/lessons/120808?language=java
import java.math.BigInteger;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[]{numer1 * denom2 + numer2 * denom1, denom1 * denom2};
        int m = BigInteger.valueOf(answer[0]).gcd(BigInteger.valueOf(answer[1])).intValue();
        
        return new int[]{answer[0] / m, answer[1] / m};
    }
}