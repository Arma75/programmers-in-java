// https://school.programmers.co.kr/learn/courses/30/lessons/120842?language=java
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int h = num_list.length / n;
        int w = n;
        int[][] answer = new int[h][w];
        
        for( int y = 0; y < h; y++ ) {
            for( int x = 0; x < w; x++ ) {
                answer[y][x] = num_list[y * w + x];
            }
        }
        
        return answer;
    }
}