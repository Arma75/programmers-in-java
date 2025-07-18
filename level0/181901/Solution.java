// https://school.programmers.co.kr/learn/courses/30/lessons/181901?language=java
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for( int i = 0; i < answer.length; i++ ) {
            answer[i] = (i + 1) * k;
        }
        
        return answer;
    }
}