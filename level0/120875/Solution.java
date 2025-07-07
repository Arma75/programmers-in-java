// https://school.programmers.co.kr/learn/courses/30/lessons/120875?language=java
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    List<int[]> permutations = new ArrayList<>();
    
    public void createPermutations(int step, int[] arr) {
        if( step == 4 ) {
            permutations.add(arr.clone());
            return;
        }
        
        for( int i = 0; i < 4; i++ ) {
            boolean bContain = false;
            for( int j = 0; j < step; j++ ) {
                if( arr[j] == i ) {
                    bContain = true;
                    break;
                }
            }
            
            if( bContain ) {
                continue;
            }
            
            arr[step] = i;
            createPermutations(step + 1, arr);
        }
    }
    
    public int solution(int[][] dots) {
        int[] arr = new int[4];
        Arrays.fill(arr, -1);
        createPermutations(0, arr);
        
        for( int[] permutation : permutations ) {
            int[] d1 = dots[permutation[0]];
            int[] d2 = dots[permutation[1]];
            int[] d3 = dots[permutation[2]];
            int[] d4 = dots[permutation[3]];
            
            if( d1[0] - d2[0] == 0 || d3[0] - d4[0] == 0 ) {
                continue;
            }
            
            double s1 = (double)(d1[1] - d2[1]) / (d1[0] - d2[0]);
            double s2 = (double)(d3[1] - d4[1]) / (d3[0] - d4[0]);
            
            if( s1 == s2 ) {
                return 1;
            }
        }
        
        return 0;
    }
}