// https://school.programmers.co.kr/learn/courses/30/lessons/181849?language=java
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for( char c : num_str.toCharArray() ) {
            answer += Integer.valueOf("" + c);
        }
        return answer;
    }
}