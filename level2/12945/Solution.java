// https://school.programmers.co.kr/learn/courses/30/lessons/12945?language=java

class Solution {
    public int solution(int n) {
        int[] fibonacci = new int[n + 1];
        for( int i = 0; i <= n; i++ ) {
            if( i < 2 ) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % 1234567;
            }
        }
        
        return fibonacci[n];
    }
}