// https://school.programmers.co.kr/learn/courses/30/lessons/181870?language=java
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(s -> s.indexOf("ad") < 0).toArray(String[]::new);
    }
}