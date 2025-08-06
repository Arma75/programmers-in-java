// https://school.programmers.co.kr/learn/courses/30/lessons/120845?language=java
import java.util.Arrays;

class Solution {
    public int solution(int[] box, int n) {
        return Arrays.stream(box).map(m -> m / n).reduce(1, (a, b) -> a * b);
    }
}