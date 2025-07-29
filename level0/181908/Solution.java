// https://school.programmers.co.kr/learn/courses/30/lessons/181908?language=java
class Solution {
    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix)? 1 : 0;
    }
}