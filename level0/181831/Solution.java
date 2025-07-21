// https://school.programmers.co.kr/learn/courses/30/lessons/181831?language=java
class Solution {
    public int solution(int[][] arr) {
        for( int i = 0; i < arr.length; i++ ) {
            for( int j = 0; j < arr[0].length; j++ ) {
                if( arr[i][j] != arr[j][i] ) {
                    return 0;
                }
            }
        }
        return 1;
    }
}