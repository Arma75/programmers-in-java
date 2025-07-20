// https://school.programmers.co.kr/learn/courses/30/lessons/181840?language=java
class Solution {
    public int solution(int[] num_list, int n) {
        for( int m : num_list ) {
            if( m == n ) {
                return 1;
            }
        }
        return 0;
    }
}