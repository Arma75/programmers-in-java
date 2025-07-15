// https://school.programmers.co.kr/learn/courses/30/lessons/120896?language=java
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        for( char c : s.toCharArray() ) {
            arr[c - 97]++;
        }
        for( int i = 0; i < 26; i++ ) {
            if( arr[i] != 1 ) {
                continue;
            }
            answer += (char)(i + 97);
        }
        return answer;
    }
}