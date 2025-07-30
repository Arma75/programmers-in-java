// https://school.programmers.co.kr/learn/courses/30/lessons/181905?language=java
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        answer += new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();
        answer += my_string.substring(e + 1);
        
        return answer;
    }
}