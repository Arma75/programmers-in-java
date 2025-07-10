// https://school.programmers.co.kr/learn/courses/30/lessons/181851?language=java
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for( int i = 0; i < rank.length; i++ ) {
            if( attendance[i] ) {
                map.put(rank[i], i);
            }
        }
        
        Arrays.sort(rank);
        
        int count = 3;
        for( int r : rank ) {
            if( !map.containsKey(r) ) {
                continue;
            }
            
            answer += map.get(r) * Math.pow(100,  count - 1);
            count--;
            
            if( count == 0 ) {
                break;
            }
        }
        
        return answer;
    }
}