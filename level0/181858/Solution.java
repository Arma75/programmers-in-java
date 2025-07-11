// https://school.programmers.co.kr/learn/courses/30/lessons/181858?language=java
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        int cnt = 0;
        for( int i = 0; i < arr.length && cnt < k; i++ ) {
            boolean bContain = false;
            for( int j = 0; j < cnt; j++ ) {
                if( answer[j] == arr[i] ) {
                    bContain = true;
                    break;
                }
            }
            
            if( !bContain ) {
                answer[cnt++] = arr[i];
            }
        }
        
        return answer;
    }
}