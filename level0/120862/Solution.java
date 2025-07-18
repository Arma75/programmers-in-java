// https://school.programmers.co.kr/learn/courses/30/lessons/120862?language=java
class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000;
        for( int i = 0; i < numbers.length - 1; i++ ) {
            for( int j = i + 1; j < numbers.length; j++ ) {
                answer = Math.max(answer, numbers[i] * numbers[j]);
            }
        }
        return answer;
    }
}