// https://school.programmers.co.kr/learn/courses/30/lessons/120811?language=java
import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}