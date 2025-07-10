// https://school.programmers.co.kr/learn/courses/30/lessons/181836?language=java
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for( int i = 0; i < answer.length; i += k ) {
            answer[i] = "";
            for( char c : picture[i / k].toCharArray() ) {
                for( int j = 0; j < k; j++ ) {
                    answer[i] += c;
                }
            }
            
            for( int j = 0; j < k; j++ ) {
                answer[i + j] = answer[i];
            }
        }
        
        return answer;
    }
}