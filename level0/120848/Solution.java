// https://school.programmers.co.kr/learn/courses/30/lessons/120848?language=java
class Solution {
    public int factorial(int n) {
        if( n < 2 ) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }
    
    public int solution(int n) {
        int answer = 0;
        for( int i = 1; factorial(i) <= n; i++ ) {
            answer = i;
        }
        
        return answer;
    }
}