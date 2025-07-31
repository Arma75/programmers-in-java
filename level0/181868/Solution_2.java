// https://school.programmers.co.kr/learn/courses/30/lessons/181868?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        String[] arr = my_string.split(" ");
        for( String str : arr ) {
            str = str.trim();
            if( !str.isEmpty() ) {
                list.add(str);
            }
        }
        return list.stream().toArray(String[]::new);
    }
}