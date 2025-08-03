// https://school.programmers.co.kr/learn/courses/30/lessons/181857?language=java
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length > 1? Integer.highestOneBit(arr.length - 1) << 1 : 1];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        return answer;
    }
}