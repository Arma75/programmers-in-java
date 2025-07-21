// https://school.programmers.co.kr/learn/courses/30/lessons/181861?language=java
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];
        int idx = 0;
        for( int n : arr ) {
            for( int i = 0; i < n; i++ ) {
                answer[idx++] = n;
            }
        }
        
        return answer;
    }
}