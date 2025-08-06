// https://school.programmers.co.kr/learn/courses/30/lessons/120812?language=java
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for( int n : array ) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((n1, n2) -> map.get(n2) - map.get(n1));
        
        if( keySet.size() > 1 && map.get(keySet.get(0)) == map.get(keySet.get(1)) ) {
            return -1;
        }
        
        return keySet.get(0);
    }
}