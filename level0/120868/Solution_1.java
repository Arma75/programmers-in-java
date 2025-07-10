// https://school.programmers.co.kr/learn/courses/30/lessons/120868?language=java
class Solution {
    public int solution(int[] sides) {
        return Math.min(sides[0], sides[1]) * 2 - 1;
    }
}