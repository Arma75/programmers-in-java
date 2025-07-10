// https://school.programmers.co.kr/learn/courses/30/lessons/120921?language=java
class Solution {
    public int solution(String A, String B) {
        int len = A.length();
        for( int i = 0; i < len; i++ ) {
            String s = A.substring(len - i, len) + A.substring(0, len - i);
            if( s.equals(B) ) {
                return i;
            }
        }
        return -1;
    }
}