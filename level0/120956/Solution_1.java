// https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=java
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for( String babble : babbling ) {
            babble = babble.replaceAll("aya|ye|woo|ma", "");
            answer += babble.length() == 0? 1 : 0;
        }
        
        return answer;
    }
}