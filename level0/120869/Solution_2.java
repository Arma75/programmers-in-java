// https://school.programmers.co.kr/learn/courses/30/lessons/120869?language=java
import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        return (int) Arrays.stream(dic).map(s -> {
            if( s.length() != spell.length ) {
                return s;
            }
            
            for( String sp : spell ) {
                if( s.indexOf(sp) < 0 ) {
                    continue;
                }
                
                s = s.substring(0, s.indexOf(sp)) + s.substring(s.indexOf(sp) + 1, s.length());
            }
            return s;
        }).filter(s -> s.length() == 0).count() > 0? 1 : 2;
    }
}