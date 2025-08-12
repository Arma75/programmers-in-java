// https://school.programmers.co.kr/learn/courses/30/lessons/160586?language=java
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        for( String key : keymap ) {
            for( int i = 0; i < key.length(); i++ ) {
                char ch = key.charAt(i);
                map.put(ch, Math.min(map.getOrDefault(ch, 100), i + 1));
            }
        }
        
        int[] answer = new int[targets.length];
        for( int i = 0; i < targets.length; i++ ) {
            int count = 0;
            for( char ch : targets[i].toCharArray() ) {
                if( map.get(ch) == null ) {
                    count = -1;
                    break;
                }
                count += map.get(ch);
            }
            
            answer[i] = count;
        }
        return answer;
    }
}