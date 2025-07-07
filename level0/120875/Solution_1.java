// https://school.programmers.co.kr/learn/courses/30/lessons/120875?language=java
class Solution {
    public int solution(int[][] dots) {
        double s1 = (double)(dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
        double s2 = (double)(dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
        if( s1 == s2 ) {
            return 1;
        }
        
        s1 = (double)(dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
        s2 = (double)(dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
        if( s1 == s2 ) {
            return 1;
        }
        
        s1 = (double)(dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
        s2 = (double)(dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]);
        if( s1 == s2 ) {
            return 1;
        }
        
        return 0;
    }
}