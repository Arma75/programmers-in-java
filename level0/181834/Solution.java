// https://school.programmers.co.kr/learn/courses/30/lessons/181834?language=java
class Solution {
    public String solution(String myString) {
        String answer = "";
        for( char c : myString.toCharArray() ) {
            if( c < 'l' ) {
                answer += 'l';
            } else {
                answer += c;
            }
        }
        return answer;
    }
}