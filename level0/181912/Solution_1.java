// https://school.programmers.co.kr/learn/courses/30/lessons/181912?language=java
import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs).map(str -> str.substring(s, s + l)).mapToInt(Integer::parseInt).filter(n -> n > k).toArray();
    }
}