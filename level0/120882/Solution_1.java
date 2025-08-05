// https://school.programmers.co.kr/learn/courses/30/lessons/120882?language=java
import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        return IntStream.range(0, score.length).map(n -> 1 + (int) Arrays.stream(score).filter(s -> s[0] + s[1] > score[n][0] + score[n][1]).count()).toArray();
    }
}