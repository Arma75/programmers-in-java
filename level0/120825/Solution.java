// https://school.programmers.co.kr/learn/courses/30/lessons/120825?language=java
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for( char c : my_string.toCharArray() ) {
            for( int i = 0; i < n; i++ ) {
                answer += c;
            }
        }
        return answer;
    }
}