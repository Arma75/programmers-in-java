// https://school.programmers.co.kr/learn/courses/30/lessons/120808?language=java
class Solution {
    public int gcd(int a, int b) {
        if( b == 0 ) {
            return a;
        }
        
        return gcd(b, a % b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[]{numer1 * denom2 + numer2 * denom1, denom1 * denom2};
        int m = gcd(answer[0], answer[1]);
        
        return new int[]{answer[0] / m, answer[1] / m};
    }
}