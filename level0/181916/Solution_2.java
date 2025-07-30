// https://school.programmers.co.kr/learn/courses/30/lessons/181916?language=java
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        frequencies.put(a, 1);
        frequencies.put(b, frequencies.getOrDefault(b, 0) + 1);
        frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        frequencies.put(d, frequencies.getOrDefault(d, 0) + 1);
        
        if( frequencies.size() == 1 ) {
            return 1111 * a;
        } else if( frequencies.size() == 2 ) {
            if( frequencies.get(a) == 2 ) {
                Set<Integer> keySet = frequencies.keySet();
                Iterator<Integer> iterator = keySet.iterator();
                int p = iterator.next();
                int q = iterator.next();
                return (p + q) * Math.abs(p - q);
            } else {
                Set<Integer> keySet = frequencies.keySet();
                Iterator<Integer> iterator = keySet.iterator();
                int key1 = iterator.next();
                int key2 = iterator.next();
                int p = frequencies.get(key1) == 3? key1 : key2;
                int q = frequencies.get(key1) == 3? key2 : key1;
                return (int) Math.pow(10 * p + q, 2);
            }
        } else if( frequencies.size() == 3 ) {
            Set<Integer> keySet = frequencies.keySet();
            Iterator<Integer> iterator = keySet.iterator();
            int key1 = iterator.next();
            int key2 = iterator.next();
            int key3 = iterator.next();
            if( frequencies.get(key1) == 2 ) {
                return key2 * key3;
            } else if( frequencies.get(key2) == 2 ) {
                return key1 * key3;
            } else if( frequencies.get(key3) == 2 ) {
                return key1 * key2;
            }
        }
        
        return Math.min(a, Math.min(b, Math.min(c, d)));
    }
}