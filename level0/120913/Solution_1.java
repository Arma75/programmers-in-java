// https://school.programmers.co.kr/learn/courses/30/lessons/120913?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for( int i = 0; i < my_str.length(); i += n ) {
            list.add(my_str.substring(i, Math.min(i + n, my_str.length())));
        }
        return list.toArray(String[]::new);
    }
}