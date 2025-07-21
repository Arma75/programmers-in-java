// https://school.programmers.co.kr/learn/courses/30/lessons/181868?language=java
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.split(" ")).filter(s -> !s.isEmpty()).toArray(String[]::new);
    }
}