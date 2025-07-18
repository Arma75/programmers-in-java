// https://school.programmers.co.kr/learn/courses/30/lessons/181906?language=java
class Solution {
    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix)? 1 : 0;
    }
}