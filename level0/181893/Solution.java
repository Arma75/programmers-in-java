// https://school.programmers.co.kr/learn/courses/30/lessons/181893?language=java
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr.clone();
        
        for( int i = 0; i < query.length; i++ ) {
            if( i % 2 == 0 ) {
                answer = Arrays.copyOfRange(answer, 0, query[i] + 1);
            } else {
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }
        
        return answer;
    }
}