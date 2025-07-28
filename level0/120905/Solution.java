// https://school.programmers.co.kr/learn/courses/30/lessons/120905?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for( int m : numlist ) {
            if( m % n == 0 ) {
                list.add(m);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}