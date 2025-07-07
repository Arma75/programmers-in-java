// https://school.programmers.co.kr/learn/courses/30/lessons/120876?language=java
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        answer += Math.max(0, Math.min(lines[0][1], lines[1][1]) - Math.max(lines[0][0], lines[1][0]));
        answer += Math.max(0, Math.min(lines[0][1], lines[2][1]) - Math.max(lines[0][0], lines[2][0]));
        answer += Math.max(0, Math.min(lines[1][1], lines[2][1]) - Math.max(lines[1][0], lines[2][0]));
        
        answer -= Math.max(0, Math.min(lines[0][1], Math.min(lines[1][1], lines[2][1])) - Math.max(lines[0][0], Math.max(lines[1][0], lines[2][0]))) * 2;
        
        return answer;
    }
}