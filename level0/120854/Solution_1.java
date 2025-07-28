// https://school.programmers.co.kr/learn/courses/30/lessons/120854?language=java
import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}