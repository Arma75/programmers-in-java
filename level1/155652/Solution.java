// https://school.programmers.co.kr/learn/courses/30/lessons/155652?language=java
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for( char ch : s.toCharArray() ) {
            for( int i = 0; i < index; i++ ) {
                ch = (char)(((int)ch + 1 - 97) % 26 + 97);
                if( skip.indexOf("" + ch) >= 0 ) {
                    i--;
                }
            }
            answer += ch;
        }
        return answer;
    }
}