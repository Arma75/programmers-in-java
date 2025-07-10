// https://school.programmers.co.kr/learn/courses/30/lessons/120869?language=java
import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String target = String.join("", spell);
        
        for( String d : dic ) {
            String[] arr = d.split("");
            Arrays.sort(arr);
            
            if( target.equals(String.join("", arr)) ) {
                return 1;
            }
        }
        return 2;
    }
}