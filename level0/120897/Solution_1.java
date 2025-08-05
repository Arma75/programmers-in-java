// https://school.programmers.co.kr/learn/courses/30/lessons/120897?language=java
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for( int i = 1; i <= n; i++ ) {
            if( n % i == 0 ) {
                list.add(i);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
