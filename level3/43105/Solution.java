// https://school.programmers.co.kr/learn/courses/30/lessons/43105?language=java
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int h = triangle.length;
        
        for( int i = 1; i < h; i++ ) {
            for( int j = 0; j < triangle[i].length; j++ ) {
                int leftParent = 0;
                int rightParent = 0;
                
                if( j > 0 ) {
                    leftParent = triangle[i - 1][j - 1];
                }
                if( j < triangle[i - 1].length ) {
                    rightParent = triangle[i - 1][j];
                }
                
                triangle[i][j] += Math.max(leftParent, rightParent);
            }
        }
        
        for( int i = 0; i < triangle[h - 1].length; i++ ) {
            answer = Math.max(answer, triangle[h - 1][i]);
        }
        
        return answer;
    }
}