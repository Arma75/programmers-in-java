// https://school.programmers.co.kr/learn/courses/30/lessons/181927?language=java
class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        System.arraycopy(num_list, 0, answer, 0, len);
        
        if( num_list[len - 1] > num_list[len - 2] ) {
            answer[len] = num_list[len - 1] - num_list[len - 2];
        } else {
            answer[len] = num_list[len - 1] * 2;
        }
        
        return answer;
    }
}