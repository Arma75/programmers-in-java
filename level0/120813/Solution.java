// https://school.programmers.co.kr/learn/courses/30/lessons/120813?language=java
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(int)Math.ceil(n / 2.)];
        for( int i = 0; i < answer.length; i++ ) {
            answer[i] = 1 + i * 2;
        }
        return answer;
    }
}