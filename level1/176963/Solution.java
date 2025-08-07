// https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=java
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for( int i = 0; i < name.length; i++ ) {
            map.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for( int i = 0; i < photo.length; i++ ) {
            int point = 0;
            for( String p : photo[i] ) {
                point += map.getOrDefault(p, 0);
            }
            answer[i] = point;
        }
        
        return answer;
    }
}