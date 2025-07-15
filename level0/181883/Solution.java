// https://school.programmers.co.kr/learn/courses/30/lessons/181883?language=java
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for( int[] query : queries ) {
            for( int i = query[0]; i <= query[1]; i++ ) {
                arr[i]++;
            }
        }
        return arr;
    }
}