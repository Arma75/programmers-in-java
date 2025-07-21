// https://school.programmers.co.kr/learn/courses/30/lessons/181847?language=java
class Solution {
    public String solution(String n_str) {
        int sIdx = -1;
        while( n_str.charAt(++sIdx) == '0' );
        return n_str.substring(sIdx);
    }
}