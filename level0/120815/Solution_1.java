// https://school.programmers.co.kr/learn/courses/30/lessons/120815?language=java
import java.math.BigInteger;

class Solution {
    public int solution(int n) {
        return n / BigInteger.valueOf(n).gcd(BigInteger.valueOf(6)).intValue();
    }
}