// https://school.programmers.co.kr/learn/courses/30/lessons/120899?language=java
class Solution {
    public int[] solution(int[] array) {
        int[] answer = {array[0], 0};
        for( int i = 0; i < array.length; i++ ) {
            if( answer[0] < array[i] ) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}