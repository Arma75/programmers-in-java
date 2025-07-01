// https://school.programmers.co.kr/learn/courses/30/lessons/340211
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<int[]> getRobotPositionList(int[][] points, int[][] routes, int robotNum) {
        List<int[]> positionList = new ArrayList<>();
        int index = routes[robotNum][0] - 1;
        int y = points[index][0];
        int x = points[index][1];
        
        positionList.add(new int[]{y, x});
        
        for( int i = 1; i < routes[robotNum].length; i++ ) {
            int nextIndex = routes[robotNum][i] - 1;
            int nextY = points[nextIndex][0];
            int nextX = points[nextIndex][1];
            
            while( y != nextY ) {
                y += nextY - y > 0? 1 : -1;
                positionList.add(new int[]{y, x});
            }
            
            while( x != nextX ) {
                x += nextX - x > 0? 1 : -1;
                positionList.add(new int[]{y, x});
            }
        }
        
        return positionList;
    }
    
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        
        List<int[]>[] robotsPositionList = new ArrayList[routes.length];
        for( int i = 0; i < routes.length; i++ ) {
            robotsPositionList[i] = getRobotPositionList(points, routes, i);
        }
        
        int max = 0;
        for( int i = 0; i < robotsPositionList.length; i++ ) {
            if( max < robotsPositionList[i].size() ) {
                max = robotsPositionList[i].size();
            }
        }
        
        for( int i = 0; i < max; i++ ) {
            int[][] stage = new int[101][101];
            for( int j = 0; j < robotsPositionList.length; j++ ) {
                if( i >= robotsPositionList[j].size() ) {
                    continue;
                }
                
                int[] pos = robotsPositionList[j].get(i);
                int y = pos[0];
                int x = pos[1];
                
                stage[y][x]++;
            }
            
            for( int j = 0; j < 101; j++ ) {
                for( int k = 0; k < 101; k++ ) {
                    if( stage[j][k] > 1 ) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}