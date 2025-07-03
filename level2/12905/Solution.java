// https://school.programmers.co.kr/learn/courses/30/lessons/12905?language=java
class Solution
{
    public int solution(int [][]board)
    {
        int answer = board[0][0];
        int r = board.length;
        int c = board[0].length;
        for( int i = 1; i < r; i++ ) {
            for( int j = 1; j < c; j++ ) {
                int min = Math.min(Math.min(board[i - 1][j - 1], board[i - 1][j]), board[i][j - 1]);
                
                if( board[i][j] == 0 || min == 0 ) {
                    continue;
                }
                
                board[i][j] = min + 1;
                
                if( board[i][j] > answer ) {
                    answer = board[i][j];
                }
            }
        }

        return answer * answer;
    }
}