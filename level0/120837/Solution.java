// https://school.programmers.co.kr/learn/courses/30/lessons/120837?language=java
class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] ants = {5, 3, 1};
        for( int i = 0; i < 3; i++ ) {
            if( hp < ants[i] ) {
                continue;
            }
            
            answer += hp / ants[i];
            hp %= ants[i];
        }
        return answer;
    }
}