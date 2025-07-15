// https://school.programmers.co.kr/learn/courses/30/lessons/120886?language=java
import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        
        for( int i = 0; i < before.length(); i++ ) {
            if( beforeArray[i] != afterArray[i] ) {
                return 0;
            }
        }
        
        return 1;
    }
}