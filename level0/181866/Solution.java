// https://school.programmers.co.kr/learn/courses/30/lessons/181866?language=java
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myString) {
        String[] answer = Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).toArray(String[]::new);
        Arrays.sort(answer);
        return answer;
    }
}