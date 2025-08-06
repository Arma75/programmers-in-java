// https://school.programmers.co.kr/learn/courses/30/lessons/120861?language=java
import java.util.Map;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        Map<String, int[]> map = Map.of("up", new int[]{0, 1}, "down", new int[]{0, -1}, "left", new int[]{-1, 0}, "right", new int[]{1, 0});
        int x = 0, y = 0;
        
        for( String key : keyinput ) {
            int nextX = x + map.get(key)[0];
            int nextY = y + map.get(key)[1];
            
            if( Math.abs(nextX) <= board[0] / 2 && Math.abs(nextY) <= board[1] / 2 ) {
                x = nextX;
                y = nextY;
            }
        }
        
        return new int[]{x, y};
    }
}