// https://school.programmers.co.kr/learn/courses/30/lessons/120885?language=java
class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}