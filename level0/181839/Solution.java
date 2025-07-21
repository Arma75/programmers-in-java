// https://school.programmers.co.kr/learn/courses/30/lessons/181839?language=java
class Solution {
    public int solution(int a, int b) {
        if( a % 2 == 1 && b % 2 == 1 ) {
            return a * a + b * b;
        } else if( a % 2 == 1 || b % 2 == 1 ) {
            return 2 * (a + b);
        }
        
        return Math.abs(a - b);
    }
}