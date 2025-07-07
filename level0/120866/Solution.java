// https://school.programmers.co.kr/learn/courses/30/lessons/120866?language=java
class Solution {
    public boolean isSafe(int[][] board, int x, int y) {
        for( int i = Math.max(y - 1, 0); i < Math.min(y + 2, board.length); i++ ) {
            for( int j = Math.max(x - 1, 0); j < Math.min(x + 2, board.length); j++ ) {
                if( board[i][j] == 1 ) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public int solution(int[][] board) {
        int answer = 0;
        for( int i = 0; i < board.length; i++ ) {
            for( int j = 0; j < board.length; j++ ) {
                if( !isSafe(board, j, i) ) {
                    continue;
                }
                
                answer++;
            }
        }
        return answer;
    }
}