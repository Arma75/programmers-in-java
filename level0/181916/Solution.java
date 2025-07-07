// https://school.programmers.co.kr/learn/courses/30/lessons/181916?language=java
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((n1, n2) -> map.get(n1) - map.get(n2));
        
        if( map.size() == 1 ) {
            return 1111 * a;
        } else if( map.size() == 2 ) {
            if( map.get(a) == 2 ) {
                return (keySet.get(0) + keySet.get(1)) * Math.abs(keySet.get(0) - keySet.get(1));
            } else {
                return (int)Math.pow(10 * keySet.get(1) + keySet.get(0), 2);
            }
        } else if( map.size() == 3 ) {
            return keySet.get(0) * keySet.get(1);
        } else {
            return Math.min(a, Math.min(b, Math.min(c, d)));
        }
    }
}