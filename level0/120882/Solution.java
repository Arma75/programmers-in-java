// https://school.programmers.co.kr/learn/courses/30/lessons/120882?language=java
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for( int[] points : score ) {
            list.add(points[0] + points[1]);
        }
        Collections.sort(list, Collections.reverseOrder());
        
        for( int i = 0; i < score.length; i++ ) {
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return answer;
    }
}