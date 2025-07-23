// https://school.programmers.co.kr/learn/courses/30/lessons/181888?language=java
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(int)Math.ceil(num_list.length / (float)n)];
        int idx = 0;
        for( int i = 0; i < num_list.length; i += n ) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}