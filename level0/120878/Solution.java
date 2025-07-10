// https://school.programmers.co.kr/learn/courses/30/lessons/120878?language=java
class Solution {
    public int gcd(int a, int b) {
        if( b == 0 ) {
            return a;
        }
        
        return gcd(b, a % b);
    }
    
    public int solution(int a, int b) {
        b = b / gcd(a, b);
        while( b > 1 ) {
            if( b % 2 == 0 ) {
                b /= 2;
            } else if( b % 5 == 0 ) {
                b /= 5;
            } else {
                return 2;
            }
        }
        
        return 1;
    }
}