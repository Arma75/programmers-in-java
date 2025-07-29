// https://school.programmers.co.kr/learn/courses/30/lessons/120583?language=java
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for( int m : array ) {
            if( n == m ) {
                answer++;
            }
        }
        return answer;
    }
}