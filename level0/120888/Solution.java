// https://school.programmers.co.kr/learn/courses/30/lessons/120888?language=java
import java.util.Set;
import java.util.HashSet;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<Character> set = new HashSet<>();
        for( char c : my_string.toCharArray() ) {
            if( set.contains(c) ) {
                continue;
            }
            set.add(c);
            answer += c;
        }
        return answer;
    }
}