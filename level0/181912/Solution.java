// https://school.programmers.co.kr/learn/courses/30/lessons/181912?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for( String str : intStrs ) {
            String sn = str.substring(s, s + l);
            int n = Integer.parseInt(sn);
            
            if( n > k ) {
                list.add(n);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}