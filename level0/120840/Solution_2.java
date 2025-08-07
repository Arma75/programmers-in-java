// https://school.programmers.co.kr/learn/courses/30/lessons/120840?language=java
import java.util.stream.IntStream;
import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger n1 = IntStream.range(1, balls + 1).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, (a, b) -> a.multiply(b));
        BigInteger n2 = IntStream.range(1, balls - share + 1).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, (a, b) -> a.multiply(b));
        BigInteger n3 = IntStream.range(1, share + 1).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, (a, b) -> a.multiply(b));
        
        return n1.divide(n2.multiply(n3)).intValue();
    }
}