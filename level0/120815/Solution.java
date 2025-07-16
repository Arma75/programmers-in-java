// https://school.programmers.co.kr/learn/courses/30/lessons/120815?language=java
class Solution {
    public int gcd(int a, int b) {
        if( b == 0 ) {
            return a;
        }
        
        return gcd(b, a % b);
    }
    
    public int solution(int n) {
        return n / gcd(n, 6);
    }
}