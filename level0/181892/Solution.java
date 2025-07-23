// https://school.programmers.co.kr/learn/courses/30/lessons/181892?language=java
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        System.arraycopy(num_list, n - 1, answer, 0, answer.length);
        return answer;
    }
}