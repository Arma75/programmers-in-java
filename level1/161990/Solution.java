// https://school.programmers.co.kr/learn/courses/30/lessons/161990?language=java
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] wallpaper) {
        List<int[]> list = new ArrayList<>();
        for( int y = 0; y < wallpaper.length; y++ ) {
            for( int x = 0; x < wallpaper[0].length(); x++ ) {
                if( wallpaper[y].charAt(x) == '#' ) {
                    list.add(new int[]{y, x});
                }
            }
        }
        
        list.sort((a, b) -> a[0] - b[0]);
        int minY = list.get(0)[0];
        int maxY = list.get(list.size() - 1)[0];
        
        list.sort((a, b) -> a[1] - b[1]);
        int minX = list.get(0)[1];
        int maxX = list.get(list.size() - 1)[1];
        
        int[] answer = {minY, minX, maxY + 1, maxX + 1};
        return answer;
    }
}