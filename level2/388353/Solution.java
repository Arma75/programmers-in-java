// https://school.programmers.co.kr/learn/courses/30/lessons/389479
class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        
        int[] servers = new int[24];
        for( int i = 0; i < servers.length; i++ ) {
            int addedServer = 0;
            if( players[i] >= (servers[i] + 1) * m ) {
                addedServer = (players[i] - (servers[i] + 1) * m) / m + 1;
                for( int j = 0; j < k; j++ ) {
                    if( i + j >= 24 ) {
                        break;
                    }
                    servers[i + j] += addedServer;
                }
                answer += addedServer;
            }
        }
        
        return answer;
    }
}