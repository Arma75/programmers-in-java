// https://school.programmers.co.kr/learn/courses/30/lessons/120923?language=java
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int s = (int)Math.ceil((double)total / num) - (int)Math.floor(num / 2);
        for( int i = 0; i < num; i++ ) {
            answer[i] = s + i;
        }
        return answer;
    }
}