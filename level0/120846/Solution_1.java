// https://school.programmers.co.kr/learn/courses/30/lessons/120846?language=java
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.range(4, n + 1).filter(m -> {
            int count = 0;
            for( int i = 1; i <= Math.sqrt(m); i++ ) {
                if( m % i == 0 ) {
                    count += (i * i == m? 1 : 2);
                }
            }
            
            return count >= 3;
        }).count();
    }
}