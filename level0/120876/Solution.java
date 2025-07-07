// https://school.programmers.co.kr/learn/courses/30/lessons/120876?language=java
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] dots = new int[201];
        for( int[] line : lines ) {
            for( int i = line[0]; i < line[1]; i++ ) {
                dots[i + 100]++;
            }
        }
        for( int dot : dots ) {
            if( dot > 1 ) {
                answer++;
            }
        }
        return answer;
    }
}