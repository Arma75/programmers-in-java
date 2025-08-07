// https://school.programmers.co.kr/learn/courses/30/lessons/172928?language=java
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        Map<String, int[]> map = new HashMap<>();
        map.put("E", new int[]{1, 0});
        map.put("W", new int[]{-1, 0});
        map.put("S", new int[]{0, 1});
        map.put("N", new int[]{0, -1});
        
        // set initial position
        int x = 0, y = 0;
        for( int i = 0; i < park.length; i++ ) {
            x = park[i].indexOf("S");
            if( x > -1 ) {
                y = i;
                break;
            }
        }
        
        for( String route : routes) {
            String[] info = route.split(" ");
            int[] v = map.get(info[0]);
            
            int nextX = x, nextY = y;
            boolean available = true;
            for( int i = 0; i < Integer.valueOf(info[1]); i++ ) {
                nextX += v[0];
                nextY += v[1];
                
                if( nextY < 0 || nextY >= park.length || nextX < 0 || nextX >= park[0].length()  || park[nextY].charAt(nextX) == 'X' ) {
                    available = false;
                    break;
                }
            }
            
            if( available ) {
                x = nextX;
                y = nextY;
            }
        }
        
        return new int[]{y, x};
    }
}