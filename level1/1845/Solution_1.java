// https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        return Math.min(Arrays.stream(nums).boxed().collect(Collectors.toSet()).size(), nums.length / 2);
    }
}