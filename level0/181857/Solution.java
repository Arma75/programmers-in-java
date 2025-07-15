// https://school.programmers.co.kr/learn/courses/30/lessons/181857?language=java
class Solution {
    public int[] solution(int[] arr) {
        int size;
        for( size = 0; Math.pow(2, size) < arr.length; size++ ) {
        }
        
        int[] answer = new int[(int)Math.pow(2, size)];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}