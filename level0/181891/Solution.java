// https://school.programmers.co.kr/learn/courses/30/lessons/181891?language=java
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for( int i = n; i < num_list.length; i++ ) {
            answer[i - n] = num_list[i];
        }
        for( int i = 0; i < n; i++ ) {
            answer[num_list.length - n + i] = num_list[i];
        }
        return answer;
    }
}