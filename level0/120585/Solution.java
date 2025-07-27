// https://school.programmers.co.kr/learn/courses/30/lessons/120585?language=java
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for( int n : array ) {
            if( n > height ) {
                answer++;
            }
        }
        
        return answer;
    }
}