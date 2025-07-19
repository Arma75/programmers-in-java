// https://school.programmers.co.kr/learn/courses/30/lessons/181919?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        while( n != 1 ) {
            list.add(n);
            if( n % 2 == 0 ) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        list.add(1);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}