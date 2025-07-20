// https://school.programmers.co.kr/learn/courses/30/lessons/181930?language=java
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int count = 1;
        if( a == b && a == c ) {
            count = 3;
        } else if( a == b || a == c || b == c ) {
            count = 2;
        }
        
        for( int i = 1; i <= count; i++ ) {
            answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
        }
                                                          
        return answer;
    }
}