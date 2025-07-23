// https://school.programmers.co.kr/learn/courses/30/lessons/181920?language=java
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}