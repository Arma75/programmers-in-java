// https://school.programmers.co.kr/learn/courses/30/lessons/181902?language=java
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for( char c : my_string.toCharArray() ) {
            if( c <= 'Z' ) {
                answer[c - 65]++;
            } else {
                answer[c - 97 + 26]++;
            }
        }
        return answer;
    }
}