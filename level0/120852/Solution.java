// https://school.programmers.co.kr/learn/courses/30/lessons/120852?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for( int i = 2; i * i <= n; i++ ) {
            while( n % i == 0 ) {
                n /= i;
                list.add(i);
            }
        }
        list.add(n);
        
        return list.stream().filter(m -> m > 1).distinct().mapToInt(Integer::intValue).toArray();
    }
}