// https://school.programmers.co.kr/learn/courses/30/lessons/181876?language=java
class Solution {
    public String solution(String myString) {
        String answer = "";
        for( char c : myString.toCharArray() ) {
            if( c <= 'Z' ) {
                answer += (char)(c + 32);
            } else {
                answer += c;
            }
        }
        return answer;
    }
}