// https://school.programmers.co.kr/learn/courses/30/lessons/120889?language=java
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if( sides[2] < sides[0] + sides[1] ) {
            return 1;
        }
        
        return 2;
    }
}