// https://school.programmers.co.kr/learn/courses/30/lessons/161989?language=java
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = 0;
        for( int i = 0; i < section.length; i++ ) {
            if( section[i] >= start ) {
                start = section[i] + m;
                answer++;
            }
        }
        return answer;
    }
}