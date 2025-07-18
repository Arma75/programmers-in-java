// https://school.programmers.co.kr/learn/courses/30/lessons/120845?language=java
class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for( int b : box ) {
            answer *= b / n;
        }
        return answer;
    }
}