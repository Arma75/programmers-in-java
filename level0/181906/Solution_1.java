// https://school.programmers.co.kr/learn/courses/30/lessons/181906?language=java
class Solution {
    public int solution(String my_string, String is_prefix) {
        String str = my_string.substring(0, Math.min(my_string.length(), is_prefix.length()));
        if( str.equals(is_prefix) ) {
            return 1;
        }
        
        return 0;
    }
}