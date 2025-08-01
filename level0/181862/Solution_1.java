// https://school.programmers.co.kr/learn/courses/30/lessons/181862?language=java
import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("a|b|c")).filter(s -> !s.isEmpty()).toArray(String[]::new);
        
        return answer.length < 1? new String[]{"EMPTY"} : answer;
    }
}