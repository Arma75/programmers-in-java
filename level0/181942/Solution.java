// https://school.programmers.co.kr/learn/courses/30/lessons/181942?language=java
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for( int i = 0; i < str1.length(); i++ ) {
            answer += str1.charAt(i) + "" + str2.charAt(i);
        }
        return answer;
    }
}