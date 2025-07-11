// https://school.programmers.co.kr/learn/courses/30/lessons/181858?language=java
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        arr = Arrays.stream(arr).distinct().toArray();
        for( int i = 0; i < k; i++ ) {
            answer[i] = i < arr.length? arr[i] : -1;
        }
        
        return answer;
    }
}