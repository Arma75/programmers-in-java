// https://school.programmers.co.kr/learn/courses/30/lessons/120885?language=java
import java.math.BigInteger;

class Solution {
    public String solution(String bin1, String bin2) {
        return new BigInteger(bin1, 2).add(new BigInteger(bin2, 2)).toString(2);
    }
}