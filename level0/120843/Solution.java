// https://school.programmers.co.kr/learn/courses/30/lessons/120843?language=java
class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        for( int i = 1; i < k; i++ ) {
            answer = (answer + 2) % numbers.length;
        }
        return answer + 1;
    }
}