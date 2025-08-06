// https://school.programmers.co.kr/learn/courses/30/lessons/120878?language=java
class Solution {
    public int gcd(int a, int b) {
        if( b == 0 ) {
            return a;
        }
        
        return gcd(b, a % b);
    }
    
    public int solution(int a, int b) {
        b /= gcd(a, b);
        while( b % 2 == 0 ) {
            b /= 2;
        }
        while( b % 5 == 0 ) {
            b /= 5;
        }
        
        return b == 1? 1 : 2;
    }
}