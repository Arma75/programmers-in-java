// https://school.programmers.co.kr/learn/courses/30/lessons/389478
import java.util.Arrays;

class Solution {
    public int solution(int n, int w, int num) {
        int[] h = new int[w];
        for( int i = 0; i < w; i++ ) {
            int height  = 0;
            int m = i;
            
            while( n > m ) {
                m += (w - (m - height * w)) * 2 - 1;
                height++;
            }
            
            h[i] = height;
        }
        
        int sy = (num - 1) / w + 1;
        int sx = sy % 2 == 0? w - (num - 1) % w - 1 : (num - 1) % w;
        
        return h[w == 1? 0 : sx] - sy + 1;
    }
}