// https://school.programmers.co.kr/learn/courses/30/lessons/181932
class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        for( int i = 0; i < code.length(); i++ ) {
            char ch = code.charAt(i);
            
            if( ch == '1' ) {
                mode = 1 - mode;
            } else if( i % 2 == mode ) {
                answer += ch;
            }
        }
        
        return answer.length() == 0? "EMPTY" : answer;
    }
}