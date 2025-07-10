// https://school.programmers.co.kr/learn/courses/30/lessons/120868?language=java
class Solution {
    public int solution(int[] sides) {
        int min = Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1]) + 1;
        int max = sides[0] + sides[1];
        return max - min;
    }
}