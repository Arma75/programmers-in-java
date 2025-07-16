// https://school.programmers.co.kr/learn/courses/30/lessons/181924?language=java
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for( int[] query : queries ) {
            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }
        return arr;
    }
}