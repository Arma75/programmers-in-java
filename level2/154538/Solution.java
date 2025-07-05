// https://school.programmers.co.kr/learn/courses/30/lessons/154538?language=java
import java.util.Arrays;

class Solution {
    public int solution(int x, int y, int n) {
        int[] counts = new int[y + 1];
        Arrays.fill(counts, 1000001);
        counts[x] = 0;
        
        for( int i = x; i < y; i++ ) {
            if( i + n <= y ) {
                counts[i + n] = Math.min(counts[i + n], counts[i] + 1);
            }
            if( i * 2 <= y ) {
                counts[i * 2] = Math.min(counts[i * 2], counts[i] + 1);
            }
            if( i * 3 <= y ) {
                counts[i * 3] = Math.min(counts[i * 3], counts[i] + 1);
            }
        }
        
        return counts[y] > 1000000? -1 : counts[y];
    }
}