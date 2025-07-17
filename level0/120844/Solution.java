// https://school.programmers.co.kr/learn/courses/30/lessons/120844?language=java
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for( int i = 0; i < numbers.length; i++ ) {
            if( direction.equals("left") ) {
                answer[i] = numbers[(i + 1) % numbers.length];
            } else {
                answer[i] = numbers[(i - 1 + numbers.length) % numbers.length];
            }
        }
        return answer;
    }
}