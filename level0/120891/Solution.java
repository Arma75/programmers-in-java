// https://school.programmers.co.kr/learn/courses/30/lessons/120891?language=java
class Solution {
    public int solution(int order) {
        int answer = 0;
        while( order > 0 ) {
            int n = order % 10;
            if( n > 0 && n % 3 == 0 ) {
                answer++;
            }
            
            order /= 10;
        }
        return answer;
    }
}