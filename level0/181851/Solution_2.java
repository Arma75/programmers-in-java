// https://school.programmers.co.kr/learn/courses/30/lessons/181851?language=java
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] arr = IntStream.range(0, rank.length).filter(i -> attendance[i]).toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for( int n : arr ) {
            map.put(n, rank[n]);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((n1, n2) -> map.get(n1) - map.get(n2));
        
        return 10000 * keySet.get(0) + 100 * keySet.get(1) + keySet.get(2);
    }
}