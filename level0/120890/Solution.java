// https://school.programmers.co.kr/learn/courses/30/lessons/120890?language=java
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
            
        int min = 0;
        for( int i = 1; i < array.length; i++ ) {
            if( Math.abs(array[min] - n) > Math.abs(array[i] - n) ) {
                min = i;
            }
        }
        
        return array[min];
    }
}