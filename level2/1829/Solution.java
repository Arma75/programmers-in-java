// https://school.programmers.co.kr/learn/courses/30/lessons/1829
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        boolean[][] visits = new boolean[m][n];
        
        for( int y = 0; y < m; y++ ) {
            for( int x = 0; x < n; x++ ) {
                if( visits[y][x] ) {
                    continue;
                } else if( picture[y][x] == 0 ) {
                    continue;
                }
                
                numberOfArea++;
                
                int size = 0;
                int target = picture[y][x];
                Queue<int[]> queue = new LinkedList<>();
                queue.offer(new int[]{x, y});
                while( queue.size() > 0 ) {
                    int[] pos = queue.poll();
                    int px = pos[0];
                    int py = pos[1];
                    
                    if( px < 0 || px >= n || py < 0 || py >= m ) {
                        continue;
                    } else if( visits[py][px] ) {
                        continue;
                    } else if( picture[py][px] != target ) {
                        continue;
                    }
                    
                    size++;
                    visits[py][px] = true;
                    queue.offer(new int[]{px + 1, py});
                    queue.offer(new int[]{px - 1, py});
                    queue.offer(new int[]{px, py + 1});
                    queue.offer(new int[]{px, py - 1});
                }
                
                if( size > maxSizeOfOneArea ) {
                    maxSizeOfOneArea = size;
                }
            }
        }
        

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}