// https://school.programmers.co.kr/learn/courses/30/lessons/120891?language=java
import java.util.Arrays;

class Solution {
    public int solution(int order) {
        return (int) Arrays.stream((order + "").split("")).filter(s -> !s.equals("0") && Integer.parseInt(s) % 3 == 0).count();
    }
}