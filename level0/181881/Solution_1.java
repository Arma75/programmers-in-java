// https://school.programmers.co.kr/learn/courses/30/lessons/181881?language=java
import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] newArr = arr;
        
        do {
            arr = newArr;
            newArr = Arrays.stream(arr).map(n -> {
                if( n >= 50 && n % 2 == 0 ) {
                    return n / 2;
                } else if( n < 50 && n % 2 == 1 ) {
                    return n * 2 + 1;
                }
                return n;
            }).toArray();
            
            answer++;
        } while( !Arrays.equals(arr, newArr) );
        
        return answer - 1;
    }
}