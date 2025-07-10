// https://school.programmers.co.kr/learn/courses/30/lessons/181851?language=java
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        int[] nums = new int[rank.length + 1];
        for( int i = 0; i < rank.length; i++ ) {
            nums[rank[i]] = i;
            if( !attendance[i] ) {
                rank[i] = Integer.MAX_VALUE;
            }
        }
        
        Arrays.sort(rank);
        for( int i = 0; i < 3; i++ ) {
            answer += nums[rank[i]] * Math.pow(100, 2 - i);
        }
        
        return answer;
    }
}