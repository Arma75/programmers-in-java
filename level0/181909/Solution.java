// https://school.programmers.co.kr/learn/courses/30/lessons/181909?language=java
import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for( int i = 0; i < my_string.length(); i++ ) {
            answer[i] = my_string.substring(i, my_string.length());
        }
        Arrays.sort(answer);
        return answer;
    }
}