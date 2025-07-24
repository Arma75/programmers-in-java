// https://school.programmers.co.kr/learn/courses/30/lessons/120817?language=java
import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return (double)Arrays.stream(numbers).sum() / numbers.length;
    }
}