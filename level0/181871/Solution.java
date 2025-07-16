// https://school.programmers.co.kr/learn/courses/30/lessons/181871?language=java
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = myString.length() - pat.length() + 1;
        for( int i = 0; i < len; i++ ) {
            if( pat.equals(myString.substring(i, i + pat.length())) ) {
                answer++;
            }
        }
        return answer;
    }
}