// https://school.programmers.co.kr/learn/courses/30/lessons/120887?language=java
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for( ; i <= j; i++ ) {
            int n = i;
            while( n > 0 ) {
                if( n % 10 == k ) {
                    answer++;
                }
                
                n /= 10;
            }
        }
        return answer;
    }
}