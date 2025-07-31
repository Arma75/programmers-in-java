// https://school.programmers.co.kr/learn/courses/30/lessons/181888?language=java
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).filter(i -> i % n == 0).map(i -> num_list[i]).toArray();
    }
}