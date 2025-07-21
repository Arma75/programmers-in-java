// https://school.programmers.co.kr/learn/courses/30/lessons/181856?language=java
import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if( arr1.length > arr2.length ) {
            return 1;
        } else if( arr2.length > arr1.length ) {
            return -1;
        } else {
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            
            if( sum1 > sum2 ) {
                return 1;
            } else if( sum2 > sum1 ) {
                return -1;
            }
        }
        
        return 0;
    }
}