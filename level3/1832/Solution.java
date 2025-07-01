// https://school.programmers.co.kr/learn/courses/30/lessons/1832
// Dynamic Programming
class Solution {
    int MOD = 20170805;
    
    final static int RIGHT = 0;
    final static int DOWN = 1;
    
    public int solution(int m, int n, int[][] cityMap) {
        int[][][] dp = new int[m + 1][n + 1][2];
        dp[0][0][RIGHT] = 1;
        
        for( int y = 0; y < m; y++ ) {
            for( int x = 0; x < n; x++ ) {
                if( cityMap[y][x] == 0 ) {
                    dp[y][x + 1][RIGHT] += (dp[y][x][RIGHT] + dp[y][x][DOWN]) % MOD;
                    dp[y + 1][x][DOWN] += (dp[y][x][RIGHT] + dp[y][x][DOWN]) % MOD;
                } else if( cityMap[y][x] == 2 ) {
                    dp[y][x + 1][RIGHT] += dp[y][x][RIGHT];
                    dp[y + 1][x][DOWN] += dp[y][x][DOWN];
                }
                dp[y][x + 1][RIGHT] %= MOD;
                dp[y + 1][x][DOWN] %= MOD;
            }
        }
        
        return (dp[m - 1][n - 1][RIGHT] + dp[m - 1][n - 1][DOWN]) % MOD;
    }
}