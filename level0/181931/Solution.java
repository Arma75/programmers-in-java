// https://school.programmers.co.kr/learn/courses/30/lessons/181931?language=java
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int x = a;
        for( boolean include : included ) {
            if( include ) {
                answer += x;
            }
            x += d;
        }
        return answer;
    }
}