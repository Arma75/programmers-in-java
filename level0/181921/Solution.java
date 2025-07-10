// https://school.programmers.co.kr/learn/courses/30/lessons/181921?language=java
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = IntStream.rangeClosed(l, r).filter(n -> {
            String s = "" + n;
            for( char c : s.toCharArray() ) {
                if( c != '0' && c != '5' ) {
                    return false;
                }
            }
            return true;
        }).toArray();
        
        return answer.length == 0? new int[]{-1} : answer;
    }
}