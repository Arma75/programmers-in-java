// https://school.programmers.co.kr/learn/courses/30/lessons/120860?language=java
class Solution {
    public int solution(int[][] dots) {
        int w = 0, h = 0;
        for( int i = 0; i < 3; i++ ) {
            int cw = Math.abs(dots[i + 1][0] - dots[i][0]);
            int ch = Math.abs(dots[i + 1][1] - dots[i][1]);
            
            w = Math.max(w, cw);
            h = Math.max(h, ch);
        }
        
        return w * h;
    }
}