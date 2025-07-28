// https://school.programmers.co.kr/learn/courses/30/lessons/120909?language=java
class Solution {
    public int solution(int n) {
        for( int i = 1; i * i <= n; i++ ) {
            if( i * i == n ) {
                return 1;
            }
        }
        return 2;
    }
}