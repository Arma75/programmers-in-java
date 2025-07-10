// https://school.programmers.co.kr/learn/courses/30/lessons/181830?language=java
class Solution {
    public int[][] solution(int[][] arr) {
        int size = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[size][size];
        for( int i = 0; i < arr.length; i++ ) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[0].length);
        }
        return answer;
    }
}