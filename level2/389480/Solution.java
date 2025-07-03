// https://school.programmers.co.kr/learn/courses/30/lessons/389480

/*
처음에 시도한 코드입니다.
i + 1번째 물건을 훔쳤을때 B도둑의 흔적이 j인 경우 A도둑 흔적의 최소값을 기억하면서 진행하려고 했으나
최소값을 계산하는 부분에서 B도둑이 훔칠 수 있으면 B도둑이 무조건 훔치는 방향으로 진행해서 문제가 발생했습니다.
그래서 B 도둑이 훔치는 경우와 A 도둑이 훔치는 경우 중 A도둑의 흔적이 더 적은 방향으로 진행하도록 변경했습니다.

import java.util.Arrays;

class Solution {
    public int solution(int[][] info, int n, int m) {
        int answer = n;
        int stuffCount = info.length;
        int[][] aThiefEvidences = new int[stuffCount + 1][m];
        for( int i = 0; i <= stuffCount; i++ ) {
            Arrays.fill(aThiefEvidences[i], n);
        }
        aThiefEvidences[0][0] = 0;
        
        for( int i = 1; i <= stuffCount; i++ ) {
            int[] evidence = info[i - 1];
            
            for( int j = 0; j < m; j++ ) {
                aThiefEvidences[i][j] = aThiefEvidences[i - 1][j] + evidence[0];
            }
            for( int j = evidence[1]; j < m; j++ ) {
                aThiefEvidences[i][j] = aThiefEvidences[i - 1][j - evidence[1]];
            }
        }
        
        for( int i = 0; i < m; i++ ) {
            answer = Math.min(answer, aThiefEvidences[stuffCount][i]);
        }
        
        for( int i = 0; i <= stuffCount; i++ ) {
            for( int j = 0; j < m; j++ ) {
                System.out.print(aThiefEvidences[i][j] + " ");
            }
            System.out.println();
        }
        
        return answer >= n? -1 : answer;
    }
}
 */
import java.util.Arrays;

class Solution {
    public int solution(int[][] info, int n, int m) {
        int answer = n;
        int stuffCount = info.length;
        int[][] aThiefEvidences = new int[stuffCount + 1][m];
        for( int i = 0; i <= stuffCount; i++ ) {
            Arrays.fill(aThiefEvidences[i], n);
        }
        aThiefEvidences[0][0] = 0;
        
        for( int i = 1; i <= stuffCount; i++ ) {
            int[] evidence = info[i - 1];
            
            for( int j = 0; j < m; j++ ) {
                aThiefEvidences[i][j] = Math.min(aThiefEvidences[i][j], aThiefEvidences[i - 1][j] + evidence[0]);
                
                if( j + evidence[1] < m ) {
                    aThiefEvidences[i][j + evidence[1]] = aThiefEvidences[i - 1][j];
                }
            }
        }
        
        for( int i = 0; i < m; i++ ) {
            answer = Math.min(answer, aThiefEvidences[stuffCount][i]);
        }
        
        return answer >= n? -1 : answer;
    }
}