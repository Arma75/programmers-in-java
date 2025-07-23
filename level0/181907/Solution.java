// https://school.programmers.co.kr/learn/courses/30/lessons/181907?language=java
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for( int i = 0; i < n; i++ ) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}