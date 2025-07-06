// https://school.programmers.co.kr/learn/courses/30/lessons/181832?language=java
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int m = n;
        int x = -1, y = 0;
        int value = 1;
        boolean bPlus = true;
        
        while( m > 0 ) {
            for( int i = 0; i < m; i++ ) {
                answer[y][x += bPlus? 1 : -1] = value++;
            }
            
            for( int i = 0; i < m - 1; i++ ) {
                answer[y += bPlus? 1 : -1][x] = value++;
            }
            
            m--;
            bPlus = !bPlus;
        }
        
        return answer;
    }
}