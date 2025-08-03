// https://school.programmers.co.kr/learn/courses/30/lessons/181836?language=java
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] picture, int k) {
        return Arrays.stream(picture).flatMap(s -> IntStream.range(0, k).mapToObj(i -> s.replaceAll(".", "$0".repeat(k)))).toArray(String[]::new);
    }
}