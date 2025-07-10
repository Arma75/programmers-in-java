// https://school.programmers.co.kr/learn/courses/30/lessons/120861?language=java
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int sx = board[0] / 2;
        int sy = board[1] / 2;
        int[] answer = {sx, sy};
        
        for( String key : keyinput ) {
            if( key.equals("up") ) {
                answer[1] = Math.min(board[1] - 1, answer[1] + 1);
            } else if( key.equals("down") ) {
                answer[1] = Math.max(0, answer[1] - 1);
            } else if( key.equals("right") ) {
                answer[0] = Math.min(board[0] - 1, answer[0] + 1);
            } else if( key.equals("left") ) {
                answer[0] = Math.max(0, answer[0] - 1);
            }
        }
        
        answer[0] -= sx;
        answer[1] -= sy;
        
        return answer;
    }
}