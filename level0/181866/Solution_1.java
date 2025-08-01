// https://school.programmers.co.kr/learn/courses/30/lessons/181866?language=java
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    }
}